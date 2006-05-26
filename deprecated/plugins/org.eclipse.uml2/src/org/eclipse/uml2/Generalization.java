/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Generalization.java,v 1.14 2006/05/26 18:16:52 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generalization relates a specific classifier to a more general classifier, and is owned by the specific classifier. Package PowerTypes (“PowerTypes” on page 109) A generalization can be designated as being a member of a particular generalization set. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Generalization#getSpecific <em>Specific</em>}</li>
 *   <li>{@link org.eclipse.uml2.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.Generalization#isSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link org.eclipse.uml2.Generalization#getGeneralizationSets <em>Generalization Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends DirectedRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Substitutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Substitutable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the specific classifier can be used whereever the general classifier can be used. If true, the execution traces of the specific classifier will be a superset of the execution traces of the general classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Substitutable</em>' attribute.
	 * @see #setIsSubstitutable(boolean)
	 * @see org.eclipse.uml2.UML2Package#getGeneralization_IsSubstitutable()
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isSubstitutable();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Generalization#isSubstitutable <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Substitutable</em>' attribute.
	 * @see #isSubstitutable()
	 * @generated
	 */
	void setIsSubstitutable(boolean value);


	/**
	 * Returns the value of the '<em><b>Specific</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Classifier#getGeneralizations <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the specializing classifier in the Generalization relationship. Subsets DirectedRelationship::source and Element::owner. Package PowerTypes (“PowerTypes” on page 109) • generalizationSet Designates a set in which instances of Generalization is considered members.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific</em>' container reference.
	 * @see #setSpecific(Classifier)
	 * @see org.eclipse.uml2.UML2Package#getGeneralization_Specific()
	 * @see org.eclipse.uml2.Classifier#getGeneralizations
	 * @model opposite="generalization" required="true"
	 * @generated
	 */
	Classifier getSpecific();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Generalization#getSpecific <em>Specific</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' container reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(Classifier value);


	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the general classifier in the Generalization relationship. Subsets DirectedRelationship::target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Classifier)
	 * @see org.eclipse.uml2.UML2Package#getGeneralization_General()
	 * @model required="true"
	 * @generated
	 */
	Classifier getGeneral();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Classifier value);


	/**
	 * Returns the value of the '<em><b>Generalization Set</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.GeneralizationSet#getGeneralizations <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization Set</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getGeneralization_GeneralizationSet()
	 * @see org.eclipse.uml2.GeneralizationSet#getGeneralizations
	 * @model type="org.eclipse.uml2.GeneralizationSet" opposite="generalization" ordered="false"
	 * @generated
	 */
	EList getGeneralizationSets();


	/**
	 * Retrieves the first {@link org.eclipse.uml2.GeneralizationSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Generalization Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.GeneralizationSet} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.GeneralizationSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGeneralizationSets()
	 * @generated
	 */
    GeneralizationSet getGeneralizationSet(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.GeneralizationSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Generalization Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.GeneralizationSet} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.GeneralizationSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGeneralizationSets()
	 * @generated
	 */
	GeneralizationSet getGeneralizationSet(String name, boolean ignoreCase);


} // Generalization
