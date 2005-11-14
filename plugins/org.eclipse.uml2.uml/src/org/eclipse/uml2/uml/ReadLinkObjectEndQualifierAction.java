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
 * $Id: ReadLinkObjectEndQualifierAction.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Link Object End Qualifier Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This action reads a qualifier value or values on an end of a link object. The association end to retrieve the qualifier from is specified statically, and the link object to read is provided on the input pin at run time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getReadLinkObjectEndQualifierAction()
 * @model
 * @generated
 */
public interface ReadLinkObjectEndQualifierAction
		extends Action {

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Specialized from Action:input) Gives the input pin from which the link object is obtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getReadLinkObjectEndQualifierAction_Object()
	 * @model containment="true" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InputPin} and sets the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getObject()
	 * @generated
	 */
	InputPin createObject(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InputPin} and sets the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.InputPin}.
	 * @see #getObject()
	 * @generated
	 */
	InputPin createObject();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pin where the result value is placed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see org.eclipse.uml2.uml.UMLPackage#getReadLinkObjectEndQualifierAction_Result()
	 * @model containment="true" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.OutputPin} and sets the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.OutputPin}.
	 * @see #getResult()
	 * @generated
	 */
	OutputPin createResult();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute representing the qualifier to be read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(Property)
	 * @see org.eclipse.uml2.uml.UMLPackage#getReadLinkObjectEndQualifierAction_Qualifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getQualifier();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Property value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualifier attribute must be a qualifier attribute of an association end.
	 * self.qualifier.associationEnd->size() = 1
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateQualifierAttribute(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The association of the association end of the qualifier attribute must be an association class.
	 * self.qualifier.associationEnd.association.oclIsKindOf(AssociationClass)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAssociationOfAssociation(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ends of the association must not be static.
	 * self.qualifier.associationEnd.association.memberEnd->forall(e | not e.isStatic)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateEndsOfAssociation(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the object input pin is the association class that owns the association end that has the given qualifier attribute.
	 * self.object.type = self.qualifier.associationEnd.association
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTypeOfObject(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the qualifier attribute is 1..1.
	 * self.qualifier.multiplicity.is(1,1)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicityOfQualifier(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the object input pin is 1..1.
	 * self.object.multiplicity.is(1,1)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicityOfObject(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result output pin is the same as the type of the qualifier attribute.
	 * self.result.type = self.qualifier.type
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSameType(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the result output pin is 1..1.
	 * self.result.multiplicity.is(1,1)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicityOfResult(DiagnosticChain diagnostics,
			Map context);

} // ReadLinkObjectEndQualifierAction
