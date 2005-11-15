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
 * $Id: Generalization.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generalization relates a specific classifier to a more general classifier, and is owned by the specific classifier.
 * 
 * A generalization can be designated as being a member of a particular generalization set.
 * 
 * 
 * A generalization relates a specific classifier to a more general classifier, and is owned by the specific classifier.
 * 
 * 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Generalization#isSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Generalization#getGeneralizationSets <em>Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization
		extends DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Is Substitutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the specific classifier can be used wherever the general classifier can be used. If true, the execution traces of the specific classifier will be a superset of the execution traces of the general classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Substitutable</em>' attribute.
	 * @see #setIsSubstitutable(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralization_IsSubstitutable()
	 * @model required="true" ordered="false"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the general classifier in the Generalization relationship.
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
	 * Designates a set in which instances of Generalization is considered members.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization Set</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralization_GeneralizationSet()
	 * @see org.eclipse.uml2.uml.GeneralizationSet#getGeneralizations
	 * @model type="org.eclipse.uml2.uml.GeneralizationSet" opposite="generalization" ordered="false"
	 * @generated
	 */
	List getGeneralizationSets();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>' from the '<em><b>Generalization Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.GeneralizationSet} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.GeneralizationSet} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getGeneralizationSets()
	 * @generated
	 */
	GeneralizationSet getGeneralizationSet(String name);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Classifier#getGeneralizations <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the specializing classifier in the Generalization relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific</em>' container reference.
	 * @see #setSpecific(Classifier)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralization_Specific()
	 * @see org.eclipse.uml2.uml.Classifier#getGeneralizations
	 * @model opposite="generalization" required="true" ordered="false"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every Generalization associated with a given GeneralizationSet must have the same general Classifier. That is, all Generalizations for a particular GeneralizationSet must have the same superclass.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGeneralizationSameClassifier(DiagnosticChain diagnostics,
			Map context);

} // Generalization