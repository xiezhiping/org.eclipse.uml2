/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Lifelineis the concept behind a lifeline in a Sequence 
 * Diagram. A Participant may be a Part or it may be a parameter representing a part. Its qualification is a Classifier which in turn may be an Interface (or ClassifierRole?)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Lifeline#getCoveredBys <em>Covered By</em>}</li>
 *   <li>{@link org.eclipse.uml2.Lifeline#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.eclipse.uml2.Lifeline#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.Lifeline#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link org.eclipse.uml2.Lifeline#getDecomposedAs <em>Decomposed As</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getLifeline()
 * @model 
 * @generated
 */
public interface Lifeline extends NamedElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Covered By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.InteractionFragment#getCovereds <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered By</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getLifeline_CoveredBy()
	 * @see org.eclipse.uml2.InteractionFragment#getCovereds
	 * @model type="org.eclipse.uml2.InteractionFragment" opposite="covered" volatile="true"
	 * @generated
	 */
	EList getCoveredBys();

    /**
     * Retrieves the {@link org.eclipse.uml2.InteractionFragment} with the specified name from the '<em><b>Covered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.InteractionFragment} to retrieve.
	 * @return The {@link org.eclipse.uml2.InteractionFragment} with the specified name, or <code>null</code>.
	 * @see #getCoveredBys()
	 * @generated
     */
    InteractionFragment getCoveredBy(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(ConnectableElement)
	 * @see org.eclipse.uml2.UML2Package#getLifeline_Represents()
	 * @model required="true"
	 * @generated
	 */
	ConnectableElement getRepresents();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Lifeline#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(ConnectableElement value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Interaction#getLifelines <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' container reference.
	 * @see #setInteraction(Interaction)
	 * @see org.eclipse.uml2.UML2Package#getLifeline_Interaction()
	 * @see org.eclipse.uml2.Interaction#getLifelines
	 * @model opposite="lifeline" required="true"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Lifeline#getInteraction <em>Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' container reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator</em>' containment reference.
	 * @see #setDiscriminator(OpaqueExpression)
	 * @see org.eclipse.uml2.UML2Package#getLifeline_Discriminator()
	 * @model containment="true"
	 * @generated
	 */
	OpaqueExpression getDiscriminator();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Lifeline#getDiscriminator <em>Discriminator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator</em>' containment reference.
	 * @see #getDiscriminator()
	 * @generated
	 */
	void setDiscriminator(OpaqueExpression value);

    /**
     * Creates a {@link org.eclipse.uml2.OpaqueExpression} and sets the '<em><b>Discriminator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.OpaqueExpression} to create.
	 * @return The new {@link org.eclipse.uml2.OpaqueExpression}.
	 * @see #getDiscriminator()
	 * @generated
     */
    OpaqueExpression createDiscriminator(EClass eClass);
     
	/**
	 * Returns the value of the '<em><b>Decomposed As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposed As</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposed As</em>' reference.
	 * @see #setDecomposedAs(PartDecomposition)
	 * @see org.eclipse.uml2.UML2Package#getLifeline_DecomposedAs()
	 * @model 
	 * @generated
	 */
	PartDecomposition getDecomposedAs();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Lifeline#getDecomposedAs <em>Decomposed As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposed As</em>' reference.
	 * @see #getDecomposedAs()
	 * @generated
	 */
	void setDecomposedAs(PartDecomposition value);

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
	EList getOwnedElements();

} // Lifeline
