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
 * $Id: Property.java,v 1.1 2005/11/14 22:26:00 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Property represents a declared state of one or more instances in terms of a named relationship to a value or values. When a property is an attribute of a classifier, the value or values are related to the instance of the classifier by being held in slots of the instance. When a property is an association end, the value or values are related to the instance or instances at the other end(s) of the association.
 * 
 * 
 * 
 * Property is indirectly a subclass of Constructs::TypedElement. The range of valid values represented by the property can be controlled by setting the property's type.
 * A property is a structural feature.
 * 
 * A property related to a classifier by ownedAttribute represents an attribute, and it may also represent an association end. It relates an instance of the class to a value or collection of values of the type of the attribute.
 * 
 * A property related to an Association by memberEnd or its specializations represents an end of the association. The type of property is the type of the end of the association.
 * 
 * 
 * A property represents a set of instances that are owned by a containing classifier instance.
 * In the metamodel, Property is a specialization of DeploymentTarget.
 * Property represents a declared state of one or more instances in terms of a named relationship to a value or values. When a property is an attribute of a classifier, the value or values are related to the instance of the classifier by being held in slots of the instance. When a property is an association end, the value or values are related to the instance or instances at the other end(s) of the association. Property is indirectly a subclass of Constructs::TypedElement. The range of valid values represented by the property can be controlled by setting the property's type.
 * 
 * 
 * Property specializes ParameterableElement to specify that a property can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Property#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getRedefinedProperties <em>Redefined Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getSubsettedProperties <em>Subsetted Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getQualifiers <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Property#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getProperty()
 * @model
 * @generated
 */
public interface Property
		extends StructuralFeature, ConnectableElement, DeploymentTarget,
		TemplateableElement {

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.DataType#getOwnedAttributes <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataType that owns this Operation.
	 * The DataType that owns this Property.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_Datatype()
	 * @see org.eclipse.uml2.uml.DataType#getOwnedAttributes
	 * @model opposite="ownedAttribute" ordered="false"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isDerived is true, the value of the attribute is derived from information elsewhere.
	 * Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_IsDerived()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#isDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived Union</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the property is derived as the union of all of the properties that are constrained to subset it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived Union</em>' attribute.
	 * @see #setIsDerivedUnion(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_IsDerivedUnion()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isDerivedUnion();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#isDerivedUnion <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived Union</em>' attribute.
	 * @see #isDerivedUnion()
	 * @generated
	 */
	void setIsDerivedUnion(boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a String that represents a value to be used when no argument is supplied for the Property.
	 * A String that is evaluated to give a default value for the Property when an object of the owning Classifier is instantiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_Default()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the kind of aggregation that applies to the Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see org.eclipse.uml2.uml.AggregationKind
	 * @see #setAggregation(AggregationKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_Aggregation()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	AggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see org.eclipse.uml2.uml.AggregationKind
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(AggregationKind value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isComposite is true, the object containing the attribute is a container for the object or value contained in the attribute.
	 * This is a derived value, indicating whether the aggregation of the Property is composite or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_IsComposite()
	 * @model default="false" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isComposite();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#isComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Class </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class </em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class </em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_Class_()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getClass_();

	/**
	 * Returns the value of the '<em><b>Redefined Property</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties that are redefined by this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Property</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_RedefinedProperty()
	 * @model type="org.eclipse.uml2.uml.Property" ordered="false"
	 * @generated
	 */
	List getRedefinedProperties();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedProperties()
	 * @generated
	 */
	Property getRedefinedProperty(String name);

	/**
	 * Returns the value of the '<em><b>Owning Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Association#getOwnedEnds <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the owning association of this property, if any.
	 * References the owning association of this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Association</em>' container reference.
	 * @see #setOwningAssociation(Association)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_OwningAssociation()
	 * @see org.eclipse.uml2.uml.Association#getOwnedEnds
	 * @model opposite="ownedEnd" ordered="false"
	 * @generated
	 */
	Association getOwningAssociation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#getOwningAssociation <em>Owning Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Association</em>' container reference.
	 * @see #getOwningAssociation()
	 * @generated
	 */
	void setOwningAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Association#getMemberEnds <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the association of which this property is a member, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_Association()
	 * @see org.eclipse.uml2.uml.Association#getMemberEnds
	 * @model opposite="memberEnd" ordered="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSpecification that is evaluated to give a default value for the Property when an object of the owning Classifier is instantiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_DefaultValue()
	 * @model containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#getDefaultValue <em>Default Value</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case where the property is one navigable end of a binary association with both ends navigable, this gives the other end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Property)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_Opposite()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Property value);

	/**
	 * Returns the value of the '<em><b>Subsetted Property</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties of which this property is constrained to be a subset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsetted Property</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_SubsettedProperty()
	 * @model type="org.eclipse.uml2.uml.Property" ordered="false"
	 * @generated
	 */
	List getSubsettedProperties();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Subsetted Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubsettedProperties()
	 * @generated
	 */
	Property getSubsettedProperty(String name);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional list of ordered qualifier attributes for the end. If the list is empty, then the Association is not qualified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_Qualifier()
	 * @see org.eclipse.uml2.uml.Property#getAssociationEnd
	 * @model type="org.eclipse.uml2.uml.Property" opposite="associationEnd" containment="true" resolveProxies="false"
	 * @generated
	 */
	List getQualifiers();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Property} and appends it to the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Property} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Property}.
	 * @see #getQualifiers()
	 * @generated
	 */
	Property createQualifier(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Property} and appends it to the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Property}.
	 * @see #getQualifiers()
	 * @generated
	 */
	Property createQualifier();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getQualifiers()
	 * @generated
	 */
	Property getQualifier(String name);

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Property#getQualifiers <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the optional association end that owns a qualifier attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association End</em>' container reference.
	 * @see #setAssociationEnd(Property)
	 * @see org.eclipse.uml2.uml.UMLPackage#getProperty_AssociationEnd()
	 * @see org.eclipse.uml2.uml.Property#getQualifiers
	 * @model opposite="qualifier" ordered="false"
	 * @generated
	 */
	Property getAssociationEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Property#getAssociationEnd <em>Association End</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End</em>' container reference.
	 * @see #getAssociationEnd()
	 * @generated
	 */
	void setAssociationEnd(Property value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A multiplicity of a composite aggregation must not have an upper bound greater than 1.
	 * A multiplicity on an aggregate end of a composite aggregation must not have an upper bound greater than 1.
	 * isComposite implies (upperBound()->isEmpty() or upperBound() <= 1)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicityOfComposite(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subsetting may only occur when the context of the subsetting property conforms to the context of the subsetted property.
	 * self.subsettedProperty->notEmpty() implies
	 *   (self.subsettingContext()->notEmpty() and self.subsettingContext()->forAll (sc |
	 *     self.subsettedProperty->forAll(sp |
	 *       sp.subsettingContext()->exists(c | sc.conformsTo(c)))))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSubsettingContext(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A navigable property can only be redefined or subsetted by a navigable property.
	 * (self.subsettedProperty->exists(sp | sp.isNavigable()) implies self.isNavigable())
	 *   and (self.redefinedProperty->exists(rp | rp.isNavigable()) implies self.isNavigable())
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNavigablePropertyRedefinition(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subsetting property may strengthen the type of the subsetted property, and its upper bound may be less.
	 * self.subsettedProperty->forAll(sp |
	 *   self.type.conformsTo(sp.type) and
	 *     ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies
	 *       self.upperBound()<=sp.upperBound() ))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSubsettingRules(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only a navigable property can be marked as readOnly.
	 * isReadOnly implies isNavigable()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNavigableReadonly(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived union is derived.
	 * isDerivedUnion implies isDerived
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDerivedUnionIsDerived(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived union is read only.
	 * isDerivedUnion implies isReadOnly
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDerivedUnionIsReadOnly(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Property can be a DeploymentTarget if it is a kind of Node and functions as a part in the internal structure of an encompassing Node.
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
	 * A binding of a property template parameter representing an attribute must be to an attribute.
	 * (isAttribute(self) and (templateParameterSubstitution->notEmpty())
	 * 
	 *   implies (templateParameterSubstitution->forAll(ts | isAttribute(ts.formal)))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBindingToAttribute(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isAttribute() is true if the Property is defined as an attribute of some classifier.
	 * result = Classifier.allInstances->exists(c | c.attribute->includes(p))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" pRequired="true" pOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean isAttribute(Property p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query subsettingContext() gives the context for subsetting a property. It consists, in the case of an attribute, of the corresponding classifier, and in the case of an association end, all of the classifiers at the other ends.
	 * result = if association->notEmpty()
	 * then association.endType-type
	 * else if classifier->notEmpty() then Set{classifier} else Set{} endif
	 * endif
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.Type" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List subsettingContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNavigable indicates whether it is possible to navigate across the property.
	 * The query isNavigable() indicates whether it is possible to navigate across the property.
	 * result = not classifier->isEmpty() or association.owningAssociation.navigableOwnedEnd->includes(self)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean isNavigable();

} // Property
