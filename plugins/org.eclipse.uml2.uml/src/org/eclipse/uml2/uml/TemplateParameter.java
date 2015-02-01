/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TemplateParameter exposes a ParameterableElement as a formal parameter of a template.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.TemplateParameter#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateParameter#getOwnedDefault <em>Owned Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateParameter#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateParameter#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameter()
 * @model
 * @generated
 */
public interface TemplateParameter
		extends Element {

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.TemplateSignature#getOwnedParameters <em>Owned Parameter</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateSignature that owns this TemplateParameter.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' container reference.
	 * @see #setSignature(TemplateSignature)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameter_Signature()
	 * @see org.eclipse.uml2.uml.TemplateSignature#getOwnedParameters
	 * @model opposite="ownedParameter" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateSignature getSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateParameter#getSignature <em>Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' container reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TemplateSignature value);

	/**
	 * Returns the value of the '<em><b>Owned Parametered Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.TemplateParameter#getParameteredElement() <em>Parametered Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement that is owned by this TemplateParameter for the purpose of exposing it as the parameteredElement.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parametered Element</em>' containment reference.
	 * @see #setOwnedParameteredElement(ParameterableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameter_OwnedParameteredElement()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter
	 * @model opposite="owningTemplateParameter" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getOwnedParameteredElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Parametered Element</em>' containment reference.
	 * @see #getOwnedParameteredElement()
	 * @generated
	 */
	void setOwnedParameteredElement(ParameterableElement value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ParameterableElement} and sets the '<em><b>Owned Parametered Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ParameterableElement} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ParameterableElement}.
	 * @see #getOwnedParameteredElement()
	 * @generated
	 */
	ParameterableElement createOwnedParameteredElement(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement that is the default for this formal TemplateParameter.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(ParameterableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameter_Default()
	 * @model ordered="false"
	 * @generated
	 */
	ParameterableElement getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateParameter#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Owned Default</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.TemplateParameter#getDefault() <em>Default</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement that is owned by this TemplateParameter for the purpose of providing a default.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Default</em>' containment reference.
	 * @see #setOwnedDefault(ParameterableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameter_OwnedDefault()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getOwnedDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateParameter#getOwnedDefault <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default</em>' containment reference.
	 * @see #getOwnedDefault()
	 * @generated
	 */
	void setOwnedDefault(ParameterableElement value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ParameterableElement} and sets the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ParameterableElement} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ParameterableElement}.
	 * @see #getOwnedDefault()
	 * @generated
	 */
	ParameterableElement createOwnedDefault(EClass eClass);

	/**
	 * Returns the value of the '<em><b>Parametered Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement exposed by this TemplateParameter.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parametered Element</em>' reference.
	 * @see #setParameteredElement(ParameterableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getTemplateParameter_ParameteredElement()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter
	 * @model opposite="templateParameter" required="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getParameteredElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.TemplateParameter#getParameteredElement <em>Parametered Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametered Element</em>' reference.
	 * @see #getParameteredElement()
	 * @generated
	 */
	void setParameteredElement(ParameterableElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default must be compatible with the formal TemplateParameter.
	 * default <> null implies default.isCompatibleWith(parameteredElement)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMustBeCompatible(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // TemplateParameter
