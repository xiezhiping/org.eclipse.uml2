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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LinkEndDestructionData is LinkEndData used to provide values for one end of a link to be destroyed by a DestroyLinkAction.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndDestructionData#isDestroyDuplicates <em>Is Destroy Duplicates</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getLinkEndDestructionData()
 * @model
 * @generated
 */
public interface LinkEndDestructionData
		extends LinkEndData {

	/**
	 * Returns the value of the '<em><b>Is Destroy Duplicates</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether to destroy duplicates of the value in nonunique Association ends.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Destroy Duplicates</em>' attribute.
	 * @see #setIsDestroyDuplicates(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getLinkEndDestructionData_IsDestroyDuplicates()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDestroyDuplicates();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.LinkEndDestructionData#isDestroyDuplicates <em>Is Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Duplicates</em>' attribute.
	 * @see #isDestroyDuplicates()
	 * @generated
	 */
	void setIsDestroyDuplicates(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinkEndDestructionData for ordered, nonunique Association ends must have a single destroyAt InputPin if isDestroyDuplicates is false, which must be of type UnlimitedNatural and have a multiplicity of 1..1. Otherwise, the action has no destroyAt input pin.
	 * if  not end.isOrdered or end.isUnique or isDestroyDuplicates
	 * then destroyAt = null
	 * else
	 * 	destroyAt <> null and 
	 * 	destroyAt->forAll(type=UnlimitedNatural and is(1,1))
	 * endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateDestroyAtPin(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * Returns the value of the '<em><b>Destroy At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that provides the position of an existing link to be destroyed in an ordered, nonunique Association end. The type of the destroyAt InputPin is UnlimitedNatural, but the value cannot be zero or unlimited.
	 * <p>From package UML::Actions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destroy At</em>' reference.
	 * @see #setDestroyAt(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getLinkEndDestructionData_DestroyAt()
	 * @model ordered="false"
	 * @generated
	 */
	InputPin getDestroyAt();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy At</em>' reference.
	 * @see #getDestroyAt()
	 * @generated
	 */
	void setDestroyAt(InputPin value);

} // LinkEndDestructionData
