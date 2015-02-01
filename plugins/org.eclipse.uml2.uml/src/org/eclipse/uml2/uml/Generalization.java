/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Generalization is a taxonomic relationship between a more general Classifier and a more specific Classifier. Each instance of the specific Classifier is also an instance of the general Classifier. The specific Classifier inherits the features of the more general Classifier. A Generalization is owned by the specific Classifier.
 * <p>From package UML::Classification.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Generalization#getGeneralizationSets <em>Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Generalization#isSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization
		extends DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Is Substitutable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the specific Classifier can be used wherever the general Classifier can be used. If true, the execution traces of the specific Classifier shall be a superset of the execution traces of the general Classifier. If false, there is no such constraint on execution traces. If unset, the modeler has not stated whether there is such a constraint or not.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Substitutable</em>' attribute.
	 * @see #setIsSubstitutable(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralization_IsSubstitutable()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isSubstitutable();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Generalization#isSubstitutable <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Substitutable</em>' attribute.
	 * @see #isSubstitutable()
	 * @generated
	 */
	void setIsSubstitutable(boolean value);

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general classifier in the Generalization relationship.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Classifier)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralization_General()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getGeneral();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Classifier value);

	/**
	 * Returns the value of the '<em><b>Generalization Set</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.GeneralizationSet#getGeneralizations <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a set of instances of Generalization.  A Generalization may appear in many GeneralizationSets.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization Set</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralization_GeneralizationSet()
	 * @see org.eclipse.uml2.uml.GeneralizationSet#getGeneralizations
	 * @model opposite="generalization" ordered="false"
	 * @generated
	 */
	EList<GeneralizationSet> getGeneralizationSets();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Generalization Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralizationSet} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGeneralizationSets()
	 * @generated
	 */
	GeneralizationSet getGeneralizationSet(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Generalization Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralizationSet} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGeneralizationSets()
	 * @generated
	 */
	GeneralizationSet getGeneralizationSet(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Classifier#getGeneralizations <em>Generalization</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specializing Classifier in the Generalization relationship.
	 * <p>From package UML::Classification.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific</em>' container reference.
	 * @see #setSpecific(Classifier)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralization_Specific()
	 * @see org.eclipse.uml2.uml.Classifier#getGeneralizations
	 * @model opposite="generalization" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getSpecific();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Generalization#getSpecific <em>Specific</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' container reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(Classifier value);

} // Generalization
