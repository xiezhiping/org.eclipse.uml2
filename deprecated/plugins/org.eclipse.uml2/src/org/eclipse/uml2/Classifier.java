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
 * $Id: Classifier.java,v 1.17 2005/06/02 15:02:47 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classifier is a namespace whose members can include features. Classifier is an abstract metaclass. A classifier is a type and can own generalizations, thereby making it possible to define generalization relationships to other classifiers. A classifier can specify a generalization hierarchy by referencing its general classifiers. A classifier is a redefinable element, meaning that it is possible to redefine nested classifiers. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Classifier#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getInheritedMembers <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getGenerals <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getGeneralizations <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getSubstitutions <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getOwnedUseCases <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getUseCases <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2.Classifier#getOccurrences <em>Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Namespace, Type, RedefinableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Classifier does not provide a complete declaration and can typically not be instantiated. An abstract classifier is intended to be used by other classifiers e.g. as the target of general metarelationships or generalization relationships. Default value is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.eclipse.uml2.UML2Package#getClassifier_IsAbstract()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Classifier#isAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);


	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Feature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Feature#getFeaturingClassifiers <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_Feature()
	 * @see org.eclipse.uml2.Feature#getFeaturingClassifiers
	 * @model type="org.eclipse.uml2.Feature" opposite="featuringClassifier" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getFeatures();


    /**
     * Retrieves the {@link org.eclipse.uml2.Feature} with the specified '<em><b>Name</b></em>' from the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Feature} to retrieve.
	 * @return The {@link org.eclipse.uml2.Feature} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFeatures()
	 * @generated
     */
    Feature getFeature(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_InheritedMember()
	 * @model type="org.eclipse.uml2.NamedElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getInheritedMembers();


    /**
     * Retrieves the {@link org.eclipse.uml2.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.NamedElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInheritedMembers()
	 * @generated
     */
    NamedElement getInheritedMember(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_General()
	 * @model type="org.eclipse.uml2.Classifier" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getGenerals();


    /**
     * Retrieves the {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGenerals()
	 * @generated
     */
    Classifier getGeneral(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_Generalization()
	 * @see org.eclipse.uml2.Generalization#getSpecific
	 * @model type="org.eclipse.uml2.Generalization" opposite="specific" containment="true" ordered="false"
	 * @generated
	 */
	EList getGeneralizations();


    /**
     * Creates a {@link org.eclipse.uml2.Generalization} and appends it to the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Generalization} to create.
	 * @return The new {@link org.eclipse.uml2.Generalization}.
	 * @see #getGeneralizations()
	 * @generated NOT
	 * @deprecated Use #createGeneralization() instead.
     */
    Generalization createGeneralization(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.Generalization} and appends it to the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Generalization}.
	 * @see #getGeneralizations()
	 * @generated
     */
    Generalization createGeneralization();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_Attribute()
	 * @model type="org.eclipse.uml2.Property" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList getAttributes();


    /**
     * Retrieves the {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getAttributes()
	 * @generated
     */
    Property getAttribute(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Redefined Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Classifier</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_RedefinedClassifier()
	 * @model type="org.eclipse.uml2.Classifier" ordered="false"
	 * @generated
	 */
	EList getRedefinedClassifiers();


    /**
     * Retrieves the {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedClassifiers()
	 * @generated
     */
    Classifier getRedefinedClassifier(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Substitution}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_Substitution()
	 * @see org.eclipse.uml2.Substitution#getSubstitutingClassifier
	 * @model type="org.eclipse.uml2.Substitution" opposite="substitutingClassifier" containment="true" ordered="false"
	 * @generated
	 */
	EList getSubstitutions();


    /**
     * Retrieves the {@link org.eclipse.uml2.Substitution} with the specified '<em><b>Name</b></em>' from the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.Substitution} to retrieve.
	 * @return The {@link org.eclipse.uml2.Substitution} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubstitutions()
	 * @generated
     */
    Substitution getSubstitution(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.Substitution} and appends it to the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Substitution} to create.
	 * @return The new {@link org.eclipse.uml2.Substitution}.
	 * @see #getSubstitutions()
	 * @generated NOT
	 * @deprecated Use #createSubstitution() instead.
     */
    Substitution createSubstitution(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.Substitution} and appends it to the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Substitution}.
	 * @see #getSubstitutions()
	 * @generated
     */
    Substitution createSubstitution();

	/**
	 * Returns the value of the '<em><b>Powertype Extent</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.GeneralizationSet#getPowertype <em>Powertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powertype Extent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powertype Extent</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_PowertypeExtent()
	 * @see org.eclipse.uml2.GeneralizationSet#getPowertype
	 * @model type="org.eclipse.uml2.GeneralizationSet" opposite="powertype" ordered="false"
	 * @generated
	 */
	EList getPowertypeExtents();


    /**
     * Retrieves the {@link org.eclipse.uml2.GeneralizationSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.GeneralizationSet} to retrieve.
	 * @return The {@link org.eclipse.uml2.GeneralizationSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPowertypeExtents()
	 * @generated
     */
    GeneralizationSet getPowertypeExtent(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Use Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_OwnedUseCase()
	 * @model type="org.eclipse.uml2.UseCase" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedUseCases();


    /**
     * Retrieves the {@link org.eclipse.uml2.UseCase} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.UseCase} to retrieve.
	 * @return The {@link org.eclipse.uml2.UseCase} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedUseCases()
	 * @generated
     */
    UseCase getOwnedUseCase(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.UseCase} and appends it to the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.UseCase} to create.
	 * @return The new {@link org.eclipse.uml2.UseCase}.
	 * @see #getOwnedUseCases()
	 * @generated NOT
	 * @deprecated Use #createOwnedUseCase() instead.
     */
    UseCase createOwnedUseCase(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.UseCase} and appends it to the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.UseCase}.
	 * @see #getOwnedUseCases()
	 * @generated
     */
    UseCase createOwnedUseCase();

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.UseCase}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.UseCase#getSubjects <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_UseCase()
	 * @see org.eclipse.uml2.UseCase#getSubjects
	 * @model type="org.eclipse.uml2.UseCase" opposite="subject" ordered="false"
	 * @generated
	 */
	EList getUseCases();


    /**
     * Retrieves the {@link org.eclipse.uml2.UseCase} with the specified '<em><b>Name</b></em>' from the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.UseCase} to retrieve.
	 * @return The {@link org.eclipse.uml2.UseCase} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getUseCases()
	 * @generated
     */
    UseCase getUseCase(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a collaboration occurrence which indicates the collaboration that represents this classifier. (Subsets Classifier.occurrence.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(CollaborationOccurrence)
	 * @see org.eclipse.uml2.UML2Package#getClassifier_Representation()
	 * @model resolveProxies="false"
	 * @generated
	 */
	CollaborationOccurrence getRepresentation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Classifier#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(CollaborationOccurrence value);


	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.CollaborationOccurrence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the collaboration occurrences owned by the classifier. (Subsets Element. ownedElement.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getClassifier_Occurrence()
	 * @model type="org.eclipse.uml2.CollaborationOccurrence" containment="true" ordered="false"
	 * @generated
	 */
	EList getOccurrences();


    /**
     * Retrieves the {@link org.eclipse.uml2.CollaborationOccurrence} with the specified '<em><b>Name</b></em>' from the '<em><b>Occurrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.CollaborationOccurrence} to retrieve.
	 * @return The {@link org.eclipse.uml2.CollaborationOccurrence} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOccurrences()
	 * @generated
     */
    CollaborationOccurrence getOccurrence(String unqualifiedName);
      
    /**
     * Creates a {@link org.eclipse.uml2.CollaborationOccurrence} and appends it to the '<em><b>Occurrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.CollaborationOccurrence} to create.
	 * @return The new {@link org.eclipse.uml2.CollaborationOccurrence}.
	 * @see #getOccurrences()
	 * @generated NOT
	 * @deprecated Use #createOccurrence() instead.
     */
    CollaborationOccurrence createOccurrence(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.CollaborationOccurrence} and appends it to the '<em><b>Occurrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.CollaborationOccurrence}.
	 * @see #getOccurrences()
	 * @generated
     */
    CollaborationOccurrence createOccurrence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * member->select(oclIsKindOf(Feature))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set allFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * not self.allParents()->includes(self)
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateNoCyclesInGeneralization(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.parents()->forAll(c | self.maySpecializeType(c))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateSpecializeType(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.inheritedMember->includesAll(self.inherit(self.parents()->collect(p | p.inheritableMembers(self)))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateInheritedMember(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.inherit(self.parents()->collect(p | p.inheritableMembers(self))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set inheritedMember();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * generalization.general
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set parents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.parents()->union(self.parents()->collect(p | p.allParents())
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set allParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * member->select(m | c.hasVisibilityOf(m))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set inheritableMembers(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * true
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean hasVisibilityOf(NamedElement n);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * inhs
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set" inhsDataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set inherit(Set inhs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.oclIsKindOf(c.oclType)
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean maySpecializeType(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.parents()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set general();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * general = self.parents()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateGeneralEqualsParents(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * (self=other) or (self.allParents()->includes(other))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean conformsTo(Classifier other);

	// <!-- begin-custom-operations -->
	
	/**
	 * Creates a generalization between this classifier and the specified
	 * general classifier.
	 * 
	 * @param generalClassifier
	 *            The classifier to which to create a generalization.
	 * @return The new generalization.
	 * @exception IllegalArgumentException
	 *                If this classifier is already a direct or indirect parent
	 *                or child of the general classifier.
	 */
	Generalization createGeneralization(Classifier generalClassifier);

	/**
	 * Retrieves the interfaces on which this classifier has a usage dependency.
	 * 
	 * @return The interfaces used by this classifier.
	 */
	Set getUsedInterfaces();
	
	// <!-- end-custom-operations -->

} // Classifier
