/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
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
 * A GeneralizationSet is a PackageableElement whose instances represent sets of Generalization relationships.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.GeneralizationSet#isCovering <em>Is Covering</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.GeneralizationSet#isDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.GeneralizationSet#getPowertype <em>Powertype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.GeneralizationSet#getGeneralizations <em>Generalization</em>}</li>
 * </ul>
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
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Covering</em>' attribute.
	 * @see #setIsCovering(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralizationSet_IsCovering()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
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
	 * Indicates whether or not the set of specific Classifiers in a Generalization relationship have instance in common. If isDisjoint is true, the specific Classifiers for a particular GeneralizationSet have no members in common; that is, their intersection is empty. If isDisjoint is false, the specific Classifiers in a particular GeneralizationSet have one or more members in common; that is, their intersection is not empty.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralizationSet_IsDisjoint()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
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
	 * Designates the Classifier that is defined as the power type for the associated GeneralizationSet, if there is one.
	 * <p>From package UML::Classification.</p>
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
	 * Designates the instances of Generalization that are members of this GeneralizationSet.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralizationSet_Generalization()
	 * @see org.eclipse.uml2.uml.Generalization#getGeneralizationSets
	 * @model opposite="generalizationSet" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralizations();

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
	 * generalization->collect(general)->asSet()->size() <= 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGeneralizationSameClassifier(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general Classifier in any of the Generalization relationships defined for that GeneralizationSet. In other words, a power type may not be an instance of itself nor may its instances be its subclasses.
	 * powertype <> null implies generalization->forAll( gen | 
	 *     not (gen.general = powertype) and not gen.general.allParents()->includes(powertype) and not (gen.specific = powertype) and not powertype.allParents()->includes(gen.specific)
	 *   )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // GeneralizationSet
