/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: Extend.java,v 1.3 2004/06/03 02:59:17 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship specifies that the behavior of a use case may be extended by the behavior of another (usually supplementary) use case. The extension takes place at one or more specific extension points defined in the extended use case. Note, however, that the extended use case is defined independently of the extending use case and is meaningful independently of the extending use case. On the other hand, the extending use case typically defines behavior that may not necessarily be meaningful by itself. Instead, the extending use case defines a set of modular behavior increments that augment an execution of the extended use case under specific conditions. Note that the same extending use case can extend more than one use case. Furthermore, an extending use case may itself be extended. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Extend#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.Extend#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.Extend#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.Extend#getExtensionLocations <em>Extension Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getExtend()
 * @model 
 * @generated
 */
public interface Extend extends NamedElement, DirectedRelationship{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Extended Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Case</em>' reference.
	 * @see #setExtendedCase(UseCase)
	 * @see org.eclipse.uml2.UML2Package#getExtend_ExtendedCase()
	 * @model required="true"
	 * @generated
	 */
	UseCase getExtendedCase();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Extend#getExtendedCase <em>Extended Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Case</em>' reference.
	 * @see #getExtendedCase()
	 * @generated
	 */
	void setExtendedCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.UseCase#getExtends <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' container reference.
	 * @see #setExtension(UseCase)
	 * @see org.eclipse.uml2.UML2Package#getExtend_Extension()
	 * @see org.eclipse.uml2.UseCase#getExtends
	 * @model opposite="extend" required="true"
	 * @generated
	 */
	UseCase getExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Extend#getExtension <em>Extension</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' container reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(UseCase value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Constraint)
	 * @see org.eclipse.uml2.UML2Package#getExtend_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.Extend#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Constraint value);

    /**
     * Creates a {@link org.eclipse.uml2.Constraint} and sets the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.Constraint}.
	 * @see #getCondition()
	 * @generated
     */
    Constraint createCondition(EClass eClass);
     
	/**
	 * Returns the value of the '<em><b>Extension Location</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.ExtensionPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Location</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Location</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getExtend_ExtensionLocation()
	 * @model type="org.eclipse.uml2.ExtensionPoint" required="true"
	 * @generated
	 */
	EList getExtensionLocations();

    /**
     * Retrieves the {@link org.eclipse.uml2.ExtensionPoint} with the specified name from the '<em><b>Extension Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.ExtensionPoint} to retrieve.
	 * @return The {@link org.eclipse.uml2.ExtensionPoint} with the specified name, or <code>null</code>.
	 * @see #getExtensionLocations()
	 * @generated
     */
    ExtensionPoint getExtensionLocation(String unqualifiedName);
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getTargets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getSources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

} // Extend
