/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *
 * $Id: RedefinableElement.java,v 1.15 2008/01/09 18:56:02 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefinable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A redefinable element is an element that, when defined in the context of a classifier, can be redefined more specifically or differently in the context of another classifier that specializes (directly or indirectly) the context classifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableElement()
 * @model abstract="true"
 * @generated
 */
public interface RedefinableElement
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether it is possible to further specialize a RedefinableElement. If the value is true, then it is not possible to further specialize the RedefinableElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableElement_IsLeaf()
	 * @model default="false" dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isLeaf();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.RedefinableElement#isLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #isLeaf()
	 * @generated
	 */
	void setIsLeaf(boolean value);

	/**
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.RedefinableElement}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinable element that is being redefined by this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Element</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableElement_RedefinedElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<RedefinableElement> getRedefinedElements();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.RedefinableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.RedefinableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.RedefinableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedElements()
	 * @generated
	 */
	RedefinableElement getRedefinedElement(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.RedefinableElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.RedefinableElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.RedefinableElement} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.RedefinableElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinedElements()
	 * @generated
	 */
	RedefinableElement getRedefinedElement(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Redefinition Context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Classifier}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the contexts that this element may be redefined from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefinition Context</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getRedefinableElement_RedefinitionContext()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getRedefinitionContexts();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinitionContexts()
	 * @generated
	 */
	Classifier getRedefinitionContext(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>' from the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Classifier} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Classifier} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRedefinitionContexts()
	 * @generated
	 */
	Classifier getRedefinitionContext(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least one of the redefinition contexts of the redefining element must be a specialization of at least one of the redefinition contexts for each redefined element.
	 * self.redefinedElement->forAll(e | self.isRedefinitionContextValid(e))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRedefinitionContextValid(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A redefining element must be consistent with each redefined element.
	 * self.redefinedElement->forAll(re | re.isConsistentWith(self))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRedefinitionConsistent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of this RedefinableElement are properly related to the redefinition contexts of the specified RedefinableElement to allow this element to redefine the other. By default at least one of the redefinition contexts of this element must be a specialization of at least one of the redefinition contexts of the specified element.
	 * result = redefinitionContext->exists(c | c.allParents()->includes(redefined.redefinitionContext)))
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" redefinedRequired="true" redefinedOrdered="false"
	 * @generated
	 */
	boolean isRedefinitionContextValid(RedefinableElement redefined);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two RedefinableElements in a context in which redefinition is possible, whether redefinition would be logically consistent. By default, this is false; this operation must be overridden for subclasses of RedefinableElement to define the consistency conditions.
	 * redefinee.isRedefinitionContextValid(self)
	 * result = false
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false" redefineeRequired="true" redefineeOrdered="false"
	 * @generated
	 */
	boolean isConsistentWith(RedefinableElement redefinee);

} // RedefinableElement
