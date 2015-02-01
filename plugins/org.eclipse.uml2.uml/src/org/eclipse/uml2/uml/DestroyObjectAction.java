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

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DestroyObjectAction is an Action that destroys objects.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DestroyObjectAction#isDestroyLinks <em>Is Destroy Links</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DestroyObjectAction#isDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.DestroyObjectAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getDestroyObjectAction()
 * @model
 * @generated
 */
public interface DestroyObjectAction
		extends Action {

	/**
	 * Returns the value of the '<em><b>Is Destroy Links</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether links in which the object participates are destroyed along with the object.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #setIsDestroyLinks(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDestroyObjectAction_IsDestroyLinks()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDestroyLinks();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.DestroyObjectAction#isDestroyLinks <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #isDestroyLinks()
	 * @generated
	 */
	void setIsDestroyLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Destroy Owned Objects</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether objects owned by the object (via composition) are destroyed along with the object.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #setIsDestroyOwnedObjects(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDestroyObjectAction_IsDestroyOwnedObjects()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDestroyOwnedObjects();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.DestroyObjectAction#isDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #isDestroyOwnedObjects()
	 * @generated
	 */
	void setIsDestroyOwnedObjects(boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Action#getInputs() <em>Input</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin providing the object to be destroyed.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getDestroyObjectAction_Target()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.DestroyObjectAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getTarget()
	 * @generated
	 */
	InputPin createTarget(String name, Type type, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InputPin},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.InputPin}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getTarget()
	 * @generated
	 */
	InputPin createTarget(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the targe IinputPin is 1..1.
	 * target.is(1,1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target InputPin has no type.
	 * target.type= null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // DestroyObjectAction
