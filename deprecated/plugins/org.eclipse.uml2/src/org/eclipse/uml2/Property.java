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
 * $Id: Property.java,v 1.8 2005/03/15 18:44:41 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Property represents a declared state of one or more instances in terms of a named relationship to a value or values. When a property is an attribute of a classifier, the value or values are related to the instance of the classifier by being held in slots of the instance. When a property is an association end, the value or values are related to the instance or instances at the other end(s) of the association (see semantics of Association). Property is indirectly a subclass of Constructs::TypedElement. The range of valid values represented by the property can be controlled by setting the property’s type. Package AssociationClasses (“AssociationClasses” on page 107) A property may have other properties (attributes) that serve as qualifiers. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Property#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#isDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getRedefinedProperties <em>Redefined Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getSubsettedProperties <em>Subsetted Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getQualifiers <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.Property#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getProperty()
 * @model 
 * @generated
 */
public interface Property extends StructuralFeature, ConnectableElement, DeploymentTarget{
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
	 * @see org.eclipse.uml2.UML2Package#getProperty_Default()
	 * @model default="" dataType="org.eclipse.uml2.String" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDefault();

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see org.eclipse.uml2.UML2Package#getProperty_IsComposite()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isComposite();

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information. The default value is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.eclipse.uml2.UML2Package#getProperty_IsDerived()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean" volatile="true"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Property#isDerived <em>Is Derived</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Is Derived Union</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the property is derived as the union of all of the properties that are constrained to subset it. The default value is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived Union</em>' attribute.
	 * @see #setIsDerivedUnion(boolean)
	 * @see org.eclipse.uml2.UML2Package#getProperty_IsDerivedUnion()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean" volatile="true"
	 * @generated
	 */
	boolean isDerivedUnion();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Property#isDerivedUnion <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived Union</em>' attribute.
	 * @see #isDerivedUnion()
	 * @generated
	 */
	void setIsDerivedUnion(boolean value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the kind of aggregation that applies to the Property. The default value is none.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see org.eclipse.uml2.AggregationKind
	 * @see #setAggregation(AggregationKind)
	 * @see org.eclipse.uml2.UML2Package#getProperty_Aggregation()
	 * @model default="none"
	 * @generated
	 */
	AggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Property#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see org.eclipse.uml2.AggregationKind
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(AggregationKind value);

	/**
	 * Returns the value of the '<em><b>Class </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class </em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class </em>' reference.
	 * @see org.eclipse.uml2.UML2Package#getProperty_Class_()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	org.eclipse.uml2.Class getClass_();

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see org.eclipse.uml2.UML2Package#getProperty_Opposite()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Returns the value of the '<em><b>Owning Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Association#getOwnedEnds <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Association</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the owning association of this property. Subsets Property::association, NamedElement::namespace, Feature::featuringClassifier, and RedefinableElement:: redefinitionContext.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Association</em>' container reference.
	 * @see #setOwningAssociation(Association)
	 * @see org.eclipse.uml2.UML2Package#getProperty_OwningAssociation()
	 * @see org.eclipse.uml2.Association#getOwnedEnds
	 * @model opposite="ownedEnd" volatile="true"
	 * @generated
	 */
	Association getOwningAssociation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Property#getOwningAssociation <em>Owning Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Association</em>' container reference.
	 * @see #getOwningAssociation()
	 * @generated
	 */
	void setOwningAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Redefined Property</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Property</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getProperty_RedefinedProperty()
	 * @model type="org.eclipse.uml2.Property" ordered="false"
	 * @generated
	 */
	EList getRedefinedProperties();

    /**
     * Retrieves the {@link org.eclipse.uml2.Property} with the specified name from the '<em><b>Redefined Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.Property} with the specified name, or <code>null</code>.
	 * @see #getRedefinedProperties()
	 * @generated
     */
    Property getRedefinedProperty(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Subsetted Property</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsetted Property</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getProperty_SubsettedProperty()
	 * @model type="org.eclipse.uml2.Property" ordered="false"
	 * @generated
	 */
	EList getSubsettedProperties();

    /**
     * Retrieves the {@link org.eclipse.uml2.Property} with the specified name from the '<em><b>Subsetted Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.Property} with the specified name, or <code>null</code>.
	 * @see #getSubsettedProperties()
	 * @generated
     */
    Property getSubsettedProperty(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.DataType#getOwnedAttributes <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataType that owns this Property. Subsets NamedElement::namespace, Feature::featuringClassifier, and Property::classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see org.eclipse.uml2.UML2Package#getProperty_Datatype()
	 * @see org.eclipse.uml2.DataType#getOwnedAttributes
	 * @model opposite="ownedAttribute"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Property#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Association#getMemberEnds <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the association of which this property is a member, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see org.eclipse.uml2.UML2Package#getProperty_Association()
	 * @see org.eclipse.uml2.Association#getMemberEnds
	 * @model opposite="memberEnd" volatile="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Property#getAssociation <em>Association</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSpecification that is evaluated to give a default value for the Property when an object of the owning Classifier is is instantiated. Subsets Element::ownedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see org.eclipse.uml2.UML2Package#getProperty_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Property#getDefaultValue <em>Default Value</em>}' containment reference.
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
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getProperty_Qualifier()
	 * @see org.eclipse.uml2.Property#getAssociationEnd
	 * @model type="org.eclipse.uml2.Property" opposite="associationEnd" containment="true"
	 * @generated
	 */
	EList getQualifiers();

    /**
     * Retrieves the {@link org.eclipse.uml2.Property} with the specified name from the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.Property} with the specified name, or <code>null</code>.
	 * @see #getQualifiers()
	 * @generated
     */
    Property getQualifier(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Property} and appends it to the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Property} to create.
	 * @return The new {@link org.eclipse.uml2.Property}.
	 * @see #getQualifiers()
	 * @generated
     */
    Property createQualifier(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Property#getQualifiers <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End</em>' container reference.
	 * @see #setAssociationEnd(Property)
	 * @see org.eclipse.uml2.UML2Package#getProperty_AssociationEnd()
	 * @see org.eclipse.uml2.Property#getQualifiers
	 * @model opposite="qualifier"
	 * @generated
	 */
	Property getAssociationEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Property#getAssociationEnd <em>Association End</em>}' container reference.
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
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * opposite = 
	 * 	if owningAssociation->notEmpty() and association.memberEnd->size() = 2 then 
	 * 		let otherEnd = (association.memberEnd - self)->any() in 
	 * 			if otherEnd.owningAssociation->notEmpty then otherEnd else Set{} endif
	 * 	else Set {}
	 * 	endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateOppositeIsOtherEnd(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if owningAssociation->notEmpty() and association.memberEnd->size() = 2 then 
	 * 		let otherEnd = (association.memberEnd - self)->any() in 
	 * 			if otherEnd.owningAssociation->notEmpty then otherEnd else Set{} endif
	 * 	else Set {}
	 * 	endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model 
	 * @generated
	 */
	Property opposite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * isComposite implies (upperBound()->isEmpty() or upperBound() <= 1)
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateMultiplicityOfComposite(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * subsettedProperty->notEmpty() implies
	 * 	(subsettingContext()->notEmpty() and subsettingContext()->forAll (sc |
	 * 		subsettedProperty->forAll(sp | 
	 * 			sp.subsettingContext()->exists(c | sc.conformsTo(c)))))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateSubsettingContext(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * (subsettedProperty->exists(sp | sp.class->notEmpty())	
	 * 		implies class->notEmpty())
	 * and
	 * (redefinedProperty->exists(rp | rp.class->notEmpty())	
	 * 		implies class->notEmpty())
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateNavigablePropertyRedefinition(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * subsettedProperty->forAll(sp |
	 * 	type.conformsTo(sp.type) and
	 * 		((upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies
	 * 			upperBound()<=sp.upperBound() ))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateSubsettingRules(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * isReadOnly implies class->notEmpty()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateNavigableReadonly(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * isDerivedUnion implies isDerived
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateDerivedUnionIsDerived(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * (redefinee.oclIsKindOf(Property) and 
	 *     let prop: Property = redefinee.oclAsType(Property) in
	 *         type.conformsTo(prop.type) and
	 *         (lowerBound()->notEmpty and prop.lowerBound()->notEmpty() implies lowerBound() >= prop.lowerBound())
	 *     and
	 *         (upperBound()->notEmpty and prop.upperBound()->notEmpty() implies upperBound() <= prop.upperBound())
	 *     and
	 *         (prop.isDerived implies isDerived))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean isConsistentWith(RedefinableElement redefinee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if association->notEmpty()
	 * then association.endType-type 
	 * else if classifier->notEmpty then Set{classifier} else Set{} endif
	 * endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set" 
	 * @generated
	 */
	Set subsettingContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	void setIsReadOnly(boolean value);

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
	EList getRedefinedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Element getOwner();

	// <!-- begin-custom-operations -->

	/**
	 * Determines whether this property is navigable, i.e. it is part of an
	 * assocation and owned by one of its end types.
	 * 
	 * @return <code>true</code> if this property is navigable; <code>false</code>
	 *         otherwise.
	 */
	boolean isNavigable();
	
	/**
	 * Sets the navigability of this property as specified.
	 * 
	 * @param navigable
	 *            Whether this property should be navigable.
	 * @exception IllegalArgumentException
	 *                If is specified property is not an association end or if
	 *                the specified navigability does not apply.
	 */
	void setNavigable(boolean navigable);
	
	/**
	 * Sets the default to the specified boolean value.
	 * 
	 * @param value
	 *            The new value of the default.
	 * @see #getDefault()
	 */
	void setBooleanDefault(boolean value);
	
	/**
	 * Sets the default to the specified integer value.
	 * 
	 * @param value
	 *            The new value of the default.
	 * @see #getDefault()
	 */
	void setIntegerDefault(int value);
	
	/**
	 * Sets the default to the specified string value.
	 * 
	 * @param value
	 *            The new value of the default.
	 * @see #getDefault()
	 */
	void setStringDefault(String value);
	
	/**
	 * Sets the default to the specified unlimited natural value.
	 * 
	 * @param value
	 *            The new value of the default.
	 * @see #getDefault()
	 */
	void setUnlimitedNaturalDefault(int value);

	// <!-- end-custom-operations -->

} // Property
