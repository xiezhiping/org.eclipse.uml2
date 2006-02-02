/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Stereotype.java,v 1.5 2006/02/02 19:23:40 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stereotype is a kind of Class that extends Classes through Extensions. Just like a class, a stereotype may have properties, which may be referred to as tag definitions. When a stereotype is applied to a model element, the values of the properties may be referred to as tagged values. Also, stereotype names should not clash with keyword names for the extended model element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getIcons <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getStereotype()
 * @model
 * @generated
 */
public interface Stereotype
		extends org.eclipse.uml2.uml.Class {

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotype can change the graphical appearance of the extended model element by using attached icons. When this association is not null, it references the location of the icon content to be displayed within diagrams presenting the extended model elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStereotype_Icon()
	 * @model type="org.eclipse.uml2.uml.Image" containment="true" ordered="false"
	 * @generated
	 */
	EList getIcons();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Image} and appends it to the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Image}.
	 * @see #getIcons()
	 * @generated
	 */
	Image createIcon();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotype names should not clash with keyword names for the extended model element.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNameNotClash(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Stereotype may only generalize or specialize another Stereotype.
	 * generalization.general->forAll(e |e.oclIsKindOf(Stereotype)) and generalization.specific->forAll(e | e.oclIsKindOf(Stereotype)) 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGeneralize(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" metaclassRequired="true" metaclassOrdered="false" isRequiredDataType="org.eclipse.uml2.uml.Boolean" isRequiredRequired="true" isRequiredOrdered="false"
	 * @generated
	 */
	Extension createExtension(org.eclipse.uml2.uml.Class metaclass,
			boolean isRequired);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.uml.String" required="true" ordered="false"
	 * @generated
	 */
	String getKeyword();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.uml.String" required="true" ordered="false" localizeDataType="org.eclipse.uml2.uml.Boolean" localizeRequired="true" localizeOrdered="false"
	 * @generated
	 */
	String getKeyword(boolean localize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Class" ordered="false"
	 * @generated
	 */
	EList getExtendedMetaclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Class" ordered="false"
	 * @generated
	 */
	EList getAllExtendedMetaclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" locationDataType="org.eclipse.uml2.uml.String" locationRequired="true" locationOrdered="false"
	 * @generated
	 */
	Image createIcon(String location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" formatDataType="org.eclipse.uml2.uml.String" formatRequired="true" formatOrdered="false" contentDataType="org.eclipse.uml2.uml.String" contentRequired="true" contentOrdered="false"
	 * @generated
	 */
	Image createIcon(String format, String content);

} // Stereotype
