/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DestroyObjectAction.java,v 1.8 2005/05/18 16:38:29 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action destroys the object on its input pin at runtime. The object may be a link object, in which case the semantics of DestroyLinkAction also applies. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.DestroyObjectAction#isDestroyLinks <em>Is Destroy Links</em>}</li>
 *   <li>{@link org.eclipse.uml2.DestroyObjectAction#isDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}</li>
 *   <li>{@link org.eclipse.uml2.DestroyObjectAction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getDestroyObjectAction()
 * @model
 * @generated
 */
public interface DestroyObjectAction extends Action{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Destroy Links</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Destroy Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #setIsDestroyLinks(boolean)
	 * @see org.eclipse.uml2.UML2Package#getDestroyObjectAction_IsDestroyLinks()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isDestroyLinks();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.DestroyObjectAction#isDestroyLinks <em>Is Destroy Links</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Is Destroy Owned Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #setIsDestroyOwnedObjects(boolean)
	 * @see org.eclipse.uml2.UML2Package#getDestroyObjectAction_IsDestroyOwnedObjects()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean isDestroyOwnedObjects();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.DestroyObjectAction#isDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #isDestroyOwnedObjects()
	 * @generated
	 */
	void setIsDestroyOwnedObjects(boolean value);


	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Specialized from Action:input) The input pin providing the object to be destroyed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see org.eclipse.uml2.UML2Package#getDestroyObjectAction_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.DestroyObjectAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);


    /**
     * Creates a {@link org.eclipse.uml2.InputPin} and sets the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.InputPin}.
	 * @see #getTarget()
	 * @generated
     */
    InputPin createTarget(EClass eClass);

    /**
     * Creates a {@link org.eclipse.uml2.InputPin} and sets the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.InputPin}.
	 * @see #getTarget()
	 * @generated
     */
    InputPin createTarget();

} // DestroyObjectAction
