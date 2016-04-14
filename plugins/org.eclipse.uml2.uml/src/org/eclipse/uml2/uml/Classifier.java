/*
 * Copyright (c) 2005, 2016 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *   Kenn Hussey (CEA) - 327039, 351774, 384071, 418466, 451350, 485756, 491587
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
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Classifier represents a classification of instances according to their Features.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getCollaborationUses <em>Collaboration Use</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getGenerals <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getGeneralizations <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getInheritedMembers <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOwnedUseCases <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getUseCases <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getSubstitutions <em>Substitution</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier
		extends Namespace, RedefinableElement, Type, TemplateableElement {

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Classifier can only be instantiated by instantiating one of its specializations. An abstract Classifier is intended to be used by other Classifiers e.g., as the target of Associations or Generalizations.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_IsAbstract()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Classifier#isAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final Specialization</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Classifier cannot be specialized.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Final Specialization</em>' attribute.
	 * @see #setIsFinalSpecialization(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_IsFinalSpecialization()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isFinalSpecialization();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Classifier#isFinalSpecialization <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final Specialization</em>' attribute.
	 * @see #isFinalSpecialization()
	 * @generated
	 */
	void setIsFinalSpecialization(boolean value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Generalization#getSpecific <em>Specific</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Generalization relationships for this Classifier. These Generalizations navigate to more general Classifiers in the generalization hierarchy.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_Generalization()
	 * @see org.eclipse.uml2.uml.Generalization#getSpecific
	 * @model opposite="specific" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralizations();

	/**
	 * Returns the value of the '<em><b>Powertype Extent</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.GeneralizationSet#getPowertype <em>Powertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GeneralizationSet of which this Classifier is a power type.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Powertype Extent</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_PowertypeExtent()
	 * @see org.eclipse.uml2.uml.GeneralizationSet#getPowertype
	 * @model opposite="powertype" ordered="false"
	 * @generated
	 */
	EList<GeneralizationSet> getPowertypeExtents();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralizationSet} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPowertypeExtents()
	 * @generated
	 */
	GeneralizationSet getPowertypeExtent(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralizationSet} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPowertypeExtents()
	 * @generated
	 */
	GeneralizationSet getPowertypeExtent(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Feature#getFeaturingClassifiers <em>Featuring Classifier</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getMembers() <em>Member</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies each Feature directly defined in the classifier. Note that there may be members of the Classifier that are of the type Feature but are not included, e.g., inherited features.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_Feature()
	 * @see org.eclipse.uml2.uml.Feature#getFeaturingClassifiers
	 * @model opposite="featuringClassifier" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Feature} with the specified '<em><b>Name</b></em>' from the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Feature} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Feature} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFeatures()
	 * @generated
	 */
	Feature getFeature(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Feature} with the specified '<em><b>Name</b></em>' from the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Feature} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Feature} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Feature} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFeatures()
	 * @generated
	 */
	Feature getFeature(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getMembers() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All elements inherited by this Classifier from its general Classifiers.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_InheritedMember()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getInheritedMembers();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInheritedMembers()
	 * @generated
	 */
	NamedElement getInheritedMember(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInheritedMembers()
	 * @generated
	 */
	NamedElement getInheritedMember(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Redefined Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements() <em>Redefined Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers redefined by this Classifier.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Classifier</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_RedefinedClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getRedefinedClassifiers();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedClassifiers()
	 * @generated
	 */
	Classifier getRedefinedClassifier(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedClassifiers()
	 * @generated
	 */
	Classifier getRedefinedClassifier(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The generalizing Classifiers for this Classifier.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_General()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getGenerals();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGenerals()
	 * @generated
	 */
	Classifier getGeneral(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGenerals()
	 * @generated
	 */
	Classifier getGeneral(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.UseCase}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCases owned by this classifier.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_OwnedUseCase()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<UseCase> getOwnedUseCases();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.UseCase}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.UseCase}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.UseCase}.
	 * @see #getOwnedUseCases()
	 * @generated
	 */
	UseCase createOwnedUseCase(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.UseCase} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedUseCases()
	 * @generated
	 */
	UseCase getOwnedUseCase(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.UseCase} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.UseCase} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedUseCases()
	 * @generated
	 */
	UseCase getOwnedUseCase(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.UseCase}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.UseCase#getSubjects <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of UseCases for which this Classifier is the subject.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_UseCase()
	 * @see org.eclipse.uml2.uml.UseCase#getSubjects
	 * @model opposite="subject" ordered="false"
	 * @generated
	 */
	EList<UseCase> getUseCases();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>' from the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.UseCase} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getUseCases()
	 * @generated
	 */
	UseCase getUseCase(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>' from the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.UseCase} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getUseCases()
	 * @generated
	 */
	UseCase getUseCase(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Substitution}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getClientDependencies() <em>Client Dependency</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Substitutions owned by this Classifier.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_Substitution()
	 * @see org.eclipse.uml2.uml.Substitution#getSubstitutingClassifier
	 * @model opposite="substitutingClassifier" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Substitution> getSubstitutions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Substitution}, with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>', and appends it to the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Substitution}, or <code>null</code>.
	 * @param contract The '<em><b>Contract</b></em>' for the new {@link org.eclipse.uml2.uml.Substitution}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Substitution}.
	 * @see #getSubstitutions()
	 * @generated
	 */
	Substitution createSubstitution(String name, Classifier contract);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Substitution} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>' from the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Substitution} to retrieve, or <code>null</code>.
	 * @param contract The '<em><b>Contract</b></em>' of the {@link org.eclipse.uml2.uml.Substitution} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Substitution} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>', or <code>null</code>.
	 * @see #getSubstitutions()
	 * @generated
	 */
	Substitution getSubstitution(String name, Classifier contract);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Substitution} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>' from the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Substitution} to retrieve, or <code>null</code>.
	 * @param contract The '<em><b>Contract</b></em>' of the {@link org.eclipse.uml2.uml.Substitution} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Substitution} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Substitution} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>', or <code>null</code>.
	 * @see #getSubstitutions()
	 * @generated
	 */
	Substitution getSubstitution(String name, Classifier contract,
			boolean ignoreCase, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Classifier#getFeatures() <em>Feature</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All of the Properties that are direct (i.e., not inherited or imported) attributes of the Classifier.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_Attribute()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Property> getAttributes();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getAttributes()
	 * @generated
	 */
	Property getAttribute(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Property} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getAttributes()
	 * @generated
	 */
	Property getAttribute(String name, Type type, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Classifier#getCollaborationUses() <em>Collaboration Use</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CollaborationUse which indicates the Collaboration that represents this Classifier.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(CollaborationUse)
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_Representation()
	 * @model ordered="false"
	 * @generated
	 */
	CollaborationUse getRepresentation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Classifier#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(CollaborationUse value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.CollaborationUse},with the specified '<em><b>Name</b></em>', and sets the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.CollaborationUse}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.CollaborationUse}.
	 * @see #getRepresentation()
	 * @generated
	 */
	CollaborationUse createRepresentation(String name);

	/**
	 * Returns the value of the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.CollaborationUse}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CollaborationUses owned by the Classifier.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collaboration Use</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_CollaborationUse()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<CollaborationUse> getCollaborationUses();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.CollaborationUse}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.CollaborationUse}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.CollaborationUse}.
	 * @see #getCollaborationUses()
	 * @generated
	 */
	CollaborationUse createCollaborationUse(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.CollaborationUse} with the specified '<em><b>Name</b></em>' from the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.CollaborationUse} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.CollaborationUse} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getCollaborationUses()
	 * @generated
	 */
	CollaborationUse getCollaborationUse(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.CollaborationUse} with the specified '<em><b>Name</b></em>' from the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.CollaborationUse} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.CollaborationUse} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.CollaborationUse} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getCollaborationUses()
	 * @generated
	 */
	CollaborationUse getCollaborationUse(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A Classifier can not be both a transitively general and transitively specific Classifier of the same Classifier.
	 * not allParents()->includes(self)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoCyclesInGeneralization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Classifier may only specialize Classifiers of a valid type.
	 * parents()->forAll(c | self.maySpecializeType(c))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSpecializeType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general Classifier in any of the Generalization relationships defined for that GeneralizationSet. In other words, a power type may not be an instance of itself nor may its instances also be its subclasses.
	 * powertypeExtent->forAll( gs | 
	 *   gs.generalization->forAll( gen | 
	 *     not (gen.general = self) and not gen.general.allParents()->includes(self) and not (gen.specific = self) and not self.allParents()->includes(gen.specific) 
	 *   ))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parents of a Classifier must be non-final.
	 * parents()->forAll(not isFinalSpecialization)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNonFinalParents(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Generalization}, with the specified '<em><b>General</b></em>', and appends it to the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param general The '<em><b>General</b></em>' for the new {@link org.eclipse.uml2.uml.Generalization}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Generalization}.
	 * @see #getGeneralizations()
	 * @generated
	 */
	Generalization createGeneralization(Classifier general);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Generalization} with the specified '<em><b>General</b></em>' from the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param general The '<em><b>General</b></em>' of the {@link org.eclipse.uml2.uml.Generalization} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Generalization} with the specified '<em><b>General</b></em>', or <code>null</code>.
	 * @see #getGeneralizations()
	 * @generated
	 */
	Generalization getGeneralization(Classifier general);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Generalization} with the specified '<em><b>General</b></em>' from the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param general The '<em><b>General</b></em>' of the {@link org.eclipse.uml2.uml.Generalization} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Generalization} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Generalization} with the specified '<em><b>General</b></em>', or <code>null</code>.
	 * @see #getGeneralizations()
	 * @generated
	 */
	Generalization getGeneralization(Classifier general,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the attributes of this classifier, including those inherited from its parents.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Property> getAllAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the operations of this classifier.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the operations of this classifier, including those inherited from its parents.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Operation> getAllOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the first operation with the specified name, parameter names, and parameter types from this classifier.
	 * @param name The name of the operation to retrieve, or null.
	 * @param parameterNames The parameter names of the operation to retrieve, or null.
	 * @param parameterTypes The parameter types of the operation to retrieve, or null.
	 * <!-- end-model-doc -->
	 * @model ordered="false" nameDataType="org.eclipse.uml2.types.String" nameOrdered="false" parameterNamesDataType="org.eclipse.uml2.types.String" parameterNamesMany="true" parameterTypesUnique="false" parameterTypesMany="true"
	 * @generated
	 */
	Operation getOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the first operation with the specified name, parameter names, and parameter types from this classifier, ignoring case if indicated.
	 * @param name The name of the operation to retrieve, or null.
	 * @param parameterNames The parameter names of the operation to retrieve, or null.
	 * @param parameterTypes The parameter types of the operation to retrieve, or null.
	 * @param ignoreCase Whether to ignore case in String comparisons.
	 * <!-- end-model-doc -->
	 * @model ordered="false" nameDataType="org.eclipse.uml2.types.String" nameOrdered="false" parameterNamesDataType="org.eclipse.uml2.types.String" parameterNamesMany="true" parameterTypesUnique="false" parameterTypesMany="true" ignoreCaseDataType="org.eclipse.uml2.types.Boolean" ignoreCaseRequired="true" ignoreCaseOrdered="false"
	 * @generated
	 */
	Operation getOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes, boolean ignoreCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the interfaces on which this classifier has a usage dependency.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Interface> getUsedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the interfaces on which this classifier or any of its parents has a usage dependency.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Interface> getAllUsedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints.
	 * result = (self.oclIsKindOf(c.oclType()))
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" cRequired="true" cOrdered="false"
	 * @generated
	 */
	boolean maySpecializeType(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allFeatures() gives all of the Features in the namespace of the Classifier. In general, through mechanisms such as inheritance, this will be a larger set than feature.
	 * result = (member->select(oclIsKindOf(Feature))->collect(oclAsType(Feature))->asSet())
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feature> allFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parents() gives all of the immediate ancestors of a generalized Classifier.
	 * result = (generalization.general->asSet())
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> parents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces directly realized by this Classifier
	 * result = ((clientDependency->
	 *   select(oclIsKindOf(Realization) and supplier->forAll(oclIsKindOf(Interface))))->
	 *       collect(supplier.oclAsType(Interface))->asSet())
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> directlyRealizedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces directly used by this Classifier
	 * result = ((supplierDependency->
	 *   select(oclIsKindOf(Usage) and client->forAll(oclIsKindOf(Interface))))->
	 *     collect(client.oclAsType(Interface))->asSet())
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> directlyUsedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces realized by this Classifier and all of its generalizations
	 * result = (directlyRealizedInterfaces()->union(self.allParents()->collect(directlyRealizedInterfaces()))->asSet())
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> allRealizedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces used by this Classifier and all of its generalizations
	 * result = (directlyUsedInterfaces()->union(self.allParents()->collect(directlyUsedInterfaces()))->asSet())
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> allUsedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = (substitution.contract->includes(contract))
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" contractRequired="true" contractOrdered="false"
	 * @generated
	 */
	boolean isSubstitutableFor(Classifier contract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allAttributes gives an ordered set of all owned and inherited attributes of the Classifier. All owned attributes appear before any inherited attributes, and the attributes inherited from any more specific parent Classifier appear before those of any more general parent Classifier. However, if the Classifier has multiple immediate parents, then the relative ordering of the sets of attributes from those parents is not defined.
	 * result = (attribute->asSequence()->union(parents()->asSequence().allAttributes())->select(p | member->includes(p))->asOrderedSet())
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Property> allAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All StructuralFeatures related to the Classifier that may have Slots, including direct attributes, inherited attributes, private attributes in generalizations, and memberEnds of Associations, but excluding redefined StructuralFeatures.
	 * result = (member->select(oclIsKindOf(StructuralFeature))->
	 *   collect(oclAsType(StructuralFeature))->
	 *    union(self.inherit(self.allParents()->collect(p | p.attribute)->asSet())->
	 *      collect(oclAsType(StructuralFeature)))->asSet())
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<StructuralFeature> allSlottableFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inheritableMembers() gives all of the members of a Classifier that may be inherited in one of its descendants, subject to whatever visibility restrictions apply.
	 * c.allParents()->includes(self)
	 * result = (member->select(m | c.hasVisibilityOf(m)))
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false" cRequired="true" cOrdered="false"
	 * @generated
	 */
	EList<NamedElement> inheritableMembers(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query hasVisibilityOf() determines whether a NamedElement is visible in the classifier. Non-private members are visible. It is only called when the argument is something owned by a parent.
	 * allParents()->including(self)->collect(member)->includes(n)
	 * result = (n.visibility <> VisibilityKind::private)
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" nRequired="true" nOrdered="false"
	 * @generated
	 */
	boolean hasVisibilityOf(NamedElement n);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inherit() defines how to inherit a set of elements passed as its argument.  It excludes redefined elements from the result.
	 * result = (inhs->reject(inh |
	 *   inh.oclIsKindOf(RedefinableElement) and
	 *   ownedMember->select(oclIsKindOf(RedefinableElement))->
	 *     select(redefinedElement->includes(inh.oclAsType(RedefinableElement)))
	 *        ->notEmpty()))
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false" inhsMany="true" inhsOrdered="false"
	 * @generated
	 */
	EList<NamedElement> inherit(EList<NamedElement> inhs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allParents() gives all of the direct and indirect ancestors of a generalized Classifier.
	 * result = (parents()->union(parents()->collect(allParents())->asSet()))
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> allParents();

} // Classifier
