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
 * $Id: Classifier.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classifier is a type. It can specify a generalization hierarchy by referencing its general classifiers.  A classifier is also a namespace whose members can include features. Classifier is an abstract metaclass.
 * Extends a classifier with the capability to own use cases. Although the owning classifier typically represents the subject to which the owned use cases apply, this is not necessarily the case. In principle, the same use case can be applied to multiple subjects, as identified by the subject association role of a UseCase.
 * Classifier is extended with the capability to own collaboration uses. These collaboration uses link a collaboration with the classifier to give a description of the workings of the classifier.
 * A classifier is a namespace whose members can include features. Classifier is an abstract metaclass.
 * 
 * A classifier is a type and can own generalizations, thereby making it possible to define generalization relationships to other classifiers. A classifier can specify a generalization hierarchy by referencing its general classifiers.
 * 
 * A classifier is a redefinable element, meaning that it is possible to redefine nested classifiers.
 * 
 * 
 * A classifier can be parameterized, exposed as a formal template parameter, and specified as an actual parameter in a binding of a template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getGeneralizations <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getInheritedMembers <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getGenerals <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOwnedUseCases <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getUseCases <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getSubstitutions <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getCollaborationUses <em>Collaboration Use</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOwnedSignature <em>Owned Signature</em>}</li>
 * </ul>
 * </p>
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
	 * If true, the Classifier does not provide a complete declaration and can typically not be instantiated. An abstract classifier is intended to be used by other classifiers e.g. as the target of general metarelationships or generalization relationships.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_IsAbstract()
	 * @model default="false" required="true" ordered="false"
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
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Generalization relationships for this Classifier. These Generalizations navigaten to more general classifiers in the generalization hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_Generalization()
	 * @see org.eclipse.uml2.uml.Generalization#getSpecific
	 * @model type="org.eclipse.uml2.uml.Generalization" opposite="specific" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getGeneralizations();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Generalization} and appends it to the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Generalization}.
	 * @see #getGeneralizations()
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns the value of the '<em><b>Powertype Extent</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.GeneralizationSet#getPowertype <em>Powertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the GeneralizationSet of which the associated Classifier is a power type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Powertype Extent</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_PowertypeExtent()
	 * @see org.eclipse.uml2.uml.GeneralizationSet#getPowertype
	 * @model type="org.eclipse.uml2.uml.GeneralizationSet" opposite="powertype" ordered="false"
	 * @generated
	 */
	List getPowertypeExtents();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralizationSet} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getPowertypeExtents()
	 * @generated
	 */
	GeneralizationSet getPowertypeExtent(String name);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Feature#getFeaturingClassifiers <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Redefines the corresponding association in Abstractions.  Note that there may be members of the Classifier that are of the type Feature but are not included in this association, e.g. inherited features.
	 * Specifies each feature defined in the classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_Feature()
	 * @see org.eclipse.uml2.uml.Feature#getFeaturingClassifiers
	 * @model type="org.eclipse.uml2.uml.Feature" opposite="featuringClassifier" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	List getFeatures();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Feature} with the specified '<em><b>Name</b></em>' from the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Feature} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Feature} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFeatures()
	 * @generated
	 */
	Feature getFeature(String name);

	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies all elements inherited by this classifier from the general classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_InheritedMember()
	 * @model type="org.eclipse.uml2.uml.NamedElement" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	List getInheritedMembers();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.NamedElement} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.NamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInheritedMembers()
	 * @generated
	 */
	NamedElement getInheritedMember(String name);

	/**
	 * Returns the value of the '<em><b>Redefined Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Classifiers that are redefined by this Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Classifier</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_RedefinedClassifier()
	 * @model type="org.eclipse.uml2.uml.Classifier" ordered="false"
	 * @generated
	 */
	List getRedefinedClassifiers();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedClassifiers()
	 * @generated
	 */
	Classifier getRedefinedClassifier(String name);

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the general classifier in the Generalization relationship.
	 * Specifies the general Classifiers for this Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_General()
	 * @model type="org.eclipse.uml2.uml.Classifier" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	List getGenerals();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGenerals()
	 * @generated
	 */
	Classifier getGeneral(String name);

	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the use cases owned by this classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_OwnedUseCase()
	 * @model type="org.eclipse.uml2.uml.UseCase" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getOwnedUseCases();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.UseCase} and appends it to the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.UseCase}.
	 * @see #getOwnedUseCases()
	 * @generated
	 */
	UseCase createOwnedUseCase();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.UseCase} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedUseCases()
	 * @generated
	 */
	UseCase getOwnedUseCase(String name);

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.UseCase}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.UseCase#getSubjects <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of use cases for which this Classifier is the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_UseCase()
	 * @see org.eclipse.uml2.uml.UseCase#getSubjects
	 * @model type="org.eclipse.uml2.uml.UseCase" opposite="subject" ordered="false"
	 * @generated
	 */
	List getUseCases();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>' from the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.UseCase} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.UseCase} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getUseCases()
	 * @generated
	 */
	UseCase getUseCase(String name);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Substitution}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the substitutions that are owned by this Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_Substitution()
	 * @see org.eclipse.uml2.uml.Substitution#getSubstitutingClassifier
	 * @model type="org.eclipse.uml2.uml.Substitution" opposite="substitutingClassifier" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getSubstitutions();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Substitution} and appends it to the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Substitution}.
	 * @see #getSubstitutions()
	 * @generated
	 */
	Substitution createSubstitution();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Substitution} with the specified '<em><b>Name</b></em>' from the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Substitution} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Substitution} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSubstitutions()
	 * @generated
	 */
	Substitution getSubstitution(String name);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to all of the Properties that are direct (i.e. not inherited or imported) attributes of the classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_Attribute()
	 * @model type="org.eclipse.uml2.uml.Property" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	List getAttributes();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>' from the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Property} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Property} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getAttributes()
	 * @generated
	 */
	Property getAttribute(String name);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a collaboration use which indicates the collaboration that represents this classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(CollaborationUse)
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_Representation()
	 * @model resolveProxies="false" ordered="false"
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
	 * Returns the value of the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.CollaborationUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the collaboration uses owned by the classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collaboration Use</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_CollaborationUse()
	 * @model type="org.eclipse.uml2.uml.CollaborationUse" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getCollaborationUses();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.CollaborationUse} and appends it to the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.CollaborationUse}.
	 * @see #getCollaborationUses()
	 * @generated
	 */
	CollaborationUse createCollaborationUse();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.CollaborationUse} with the specified '<em><b>Name</b></em>' from the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.CollaborationUse} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.CollaborationUse} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getCollaborationUses()
	 * @generated
	 */
	CollaborationUse getCollaborationUse(String name);

	/**
	 * Returns the value of the '<em><b>Owned Signature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.RedefinableTemplateSignature#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional template signature specifying the formal template parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Signature</em>' containment reference.
	 * @see #setOwnedSignature(RedefinableTemplateSignature)
	 * @see org.eclipse.uml2.uml.UMLPackage#getClassifier_OwnedSignature()
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#getClassifier
	 * @model opposite="classifier" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	RedefinableTemplateSignature getOwnedSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Classifier#getOwnedSignature <em>Owned Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Signature</em>' containment reference.
	 * @see #getOwnedSignature()
	 * @generated
	 */
	void setOwnedSignature(RedefinableTemplateSignature value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.RedefinableTemplateSignature} and sets the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.RedefinableTemplateSignature}.
	 * @see #getOwnedSignature()
	 * @generated
	 */
	RedefinableTemplateSignature createOwnedSignature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be both a transitively general and transitively specific classifier of the same classifier.
	 * not self.allParents()->includes(self)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoCyclesInGeneralization(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classifier may only specialize classifiers of a valid type.
	 * self.parents()->forAll(c | self.maySpecializeType(c))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSpecializeType(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be both a transitively general and transitively specific classifier of the same classifier.
	 * not self.allParents()->includes(self)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGeneralizationHierarchies(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classifier may only specialize classifiers of a valid type.
	 * self.parents()->forAll(c | self.maySpecializeType(c))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSpecialize(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general Classifier in any of the Generalization relationships defined for that GeneralizationSet. In other words, a power type may not be an instance of itself nor may its instances also be its subclasses.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints.
	 * result = self.oclIsKindOf(c.oclType)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" cRequired="true" cOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean maySpecializeType(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allFeatures() gives all of the features in the namespace of the classifier. In general, through mechanisms such as inheritance, this will be a larger set than feature.
	 * result = member->select(oclIsKindOf(Feature))
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.Feature" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List allFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parents() gives all of the immediate ancestors of a generalized Classifier.
	 * result = generalization.general
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.Classifier" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List parents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inheritableMembers() gives all of the members of a classifier that may be inherited in one of its descendants, subject to whatever visibility restrictions apply.
	 * c.allParents()->includes(self)
	 * result = member->select(m | c.hasVisibilityOf(m))
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.NamedElement" ordered="false" cRequired="true" cOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List inheritableMembers(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query hasVisibilityOf() determines whether a named element is visible in the classifier. By default all are visible. It is only called when the argument is something owned by a parent.
	 * self.allParents()->collect(c | c.member)->includes(n)
	 * result = if (self.inheritedMember->includes(n)) then (n.visibility <> #private) else true
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nRequired="true" nOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean hasVisibilityOf(NamedElement n);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a classifier that defines a type that conforms to another. This is used, for example, in the specification of signature conformance for operations.
	 * result = (self=other) or (self.allParents()->includes(other))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean conformsTo(Classifier other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inherit operation is overridden to exclude redefined properties.
	 * The query inherit() defines how to inherit a set of elements. Here the operation is defined to inherit them all. It is intended to be redefined in circumstances where inheritance is affected by redefinition.
	 * result = inhs
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.NamedElement" ordered="false" inhsType="org.eclipse.uml2.uml.NamedElement" inhsMany="true" inhsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List inherit(List inhs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints.
	 * result = self.oclIsKindOf(c.oclType)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean maySpecializeType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allParents() gives all of the direct and indirect ancestors of a generalized Classifier.
	 * result = self.parents()->union(self.parents()->collect(p | p.allParents())
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.Classifier" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List allParents();

} // Classifier
