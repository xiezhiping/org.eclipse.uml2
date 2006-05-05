/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: GeneralizationSet.java,v 1.7 2006/05/05 19:36:07 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each Generalization is a binary relationship that relates a specific Classifier to a more general Classifier (i.e., from a class to its superclasses). Each GeneralizationSet defines a particular set of Generalization relationships that describe the way in which a general Classifier (or superclass) may be divided using specific subtypes. For example, a GeneralizationSet could define a partitioning of the class Person into two subclasses: Male Person and Female Person. Here, the GeneralizationSet would associate two instances of Generalization. Both instances would have Person as the general classifier, however one Generalization would involve Male Person as the specific Classifier and the other would involve Female Person as the specific classifier. In other words, the class Person can here be said to be partitioned into two subclasses: Male Person and Female Person. Person could also be divided into North American Person, Asian Person, European Person, or something else. This collection of subsets would  define a different GeneralizationSet that would associate with three other Generalization relationships. All three would have Person as the general Classifier; only the specific classifiers would differ: i.e., North American Person, Asian Person, and European Person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.GeneralizationSet#isCovering <em>Is Covering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.GeneralizationSet#isDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.GeneralizationSet#getPowertype <em>Powertype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.GeneralizationSet#getGeneralizations <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralizationSet()
 * @model
 * @generated
 */
public interface GeneralizationSet
		extends PackageableElement {

	/**
	 * Returns the value of the '<em><b>Is Covering</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates (via the associated Generalizations) whether or not the set of specific Classifiers are covering for a particular general classifier. When isCovering is true, every instance of a particular general Classifier is also an instance of at least one of its specific Classifiers for the GeneralizationSet. When isCovering is false, there are one or more instances of the particular general Classifier that are not instances of at least one of its specific Classifiers defined for the GeneralizationSet.
	 * 
	 * For example, Person could have two Generalization relationships each with a different specific Classifier: Male Person and Female Person. This GeneralizationSet would be covering because every instance of Person would be an instance of Male Person or Female Person. In contrast, Person could have a three Generalization relationships involving three specific Classifiers: North American Person, Asian Person, and European Person. This GeneralizationSet would not be covering because there are instances of Person for which these three specific Classifiers do not apply. The first example, then, could be read: any Person would be specialized as either being a Male Person or a Female Person and nothing else; the second could be read: any Person would be specialized as being North American Person, Asian Person, European Person, or something else.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Covering</em>' attribute.
	 * @see #setIsCovering(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralizationSet_IsCovering()
	 * @model default="false" dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCovering();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.GeneralizationSet#isCovering <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Covering</em>' attribute.
	 * @see #isCovering()
	 * @generated
	 */
	void setIsCovering(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Disjoint</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the set of specific Classifiers in a Generalization relationship have instance in common. If isDisjoint is true, the specific Classifiers for a particular GeneralizationSet have no members in common; that is, their intersection is empty. If isDisjoint is false, the specific Classifiers in a particular GeneralizationSet have one or more members in common; that is, their intersection is not empty. For example, Person could have two Generalization relationships, each with the different specific Classifier: Manager or Staff. This would be disjoint because every instance of Person must either be a Manager or Staff. In contrast, Person could have two Generalization relationships involving two specific (and non-covering) Classifiers: Sales Person and Manager. This GeneralizationSet would not be disjoint because there are instances of Person which can be a Sales Person and a Manager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralizationSet_IsDisjoint()
	 * @model default="false" dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDisjoint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.GeneralizationSet#isDisjoint <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjoint</em>' attribute.
	 * @see #isDisjoint()
	 * @generated
	 */
	void setIsDisjoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Powertype</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Classifier#getPowertypeExtents <em>Powertype Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the Classifier that is defined as the power type for the associated GeneralizationSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Powertype</em>' reference.
	 * @see #setPowertype(Classifier)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralizationSet_Powertype()
	 * @see org.eclipse.uml2.uml.Classifier#getPowertypeExtents
	 * @model opposite="powertypeExtent" ordered="false"
	 * @generated
	 */
	Classifier getPowertype();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.GeneralizationSet#getPowertype <em>Powertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powertype</em>' reference.
	 * @see #getPowertype()
	 * @generated
	 */
	void setPowertype(Classifier value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Generalization#getGeneralizationSets <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the instances of Generalization which are members of a given GeneralizationSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralizationSet_Generalization()
	 * @see org.eclipse.uml2.uml.Generalization#getGeneralizationSets
	 * @model type="org.eclipse.uml2.uml.Generalization" opposite="generalizationSet" ordered="false"
	 * @generated
	 */
	EList getGeneralizations();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Generalization} with the specified '<em><b>General</b></em>' from the '<em><b>Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param general The '<em><b>General</b></em>' of the {@link org.eclipse.uml2.uml.Generalization} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Generalization} with the specified '<em><b>General</b></em>', or <code>null</code>.
	 * @see #getGeneralizations()
	 * @generated
	 */
	Generalization getGeneralization(Classifier general);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every Generalization associated with a particular GeneralizationSet must have the same general Classifier.
	 * generalization->collect(g | g.general)->asSet()->size() <= 1
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGeneralizationSameClassifier(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general Classifier in any of the Generalization relationships defined for that GeneralizationSet. In other words, a power type may not be an instance of itself nor may its instances be its subclasses.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics,
			Map context);

} // GeneralizationSet
