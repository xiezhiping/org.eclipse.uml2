/*
 * Copyright (c) 2011, 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466, 451350
 *
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LiteralReal is a specification of a Real value.
 * <p>From package UML::Values.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LiteralReal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getLiteralReal()
 * @model
 * @generated
 */
public interface LiteralReal
		extends LiteralSpecification {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified Real value.
	 * <p>From package UML::Values.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.eclipse.uml2.uml.UMLPackage#getLiteralReal_Value()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.LiteralReal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // LiteralReal
