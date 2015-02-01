/*
 * Copyright (c) 2005, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351777, 382718, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *
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
 * A stereotype defines how an existing metaclass may be extended, and enables the use of platform or domain specific terminology or notation in place of, or in addition to, the ones used for the extended metaclass.
 * <p>From package UML::Packages.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getIcons <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Stereotype#getProfile <em>Profile</em>}</li>
 * </ul>
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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotype can change the graphical appearance of the extended model element by using attached icons. When this association is not null, it references the location of the icon content to be displayed within diagrams presenting the extended model elements.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStereotype_Icon()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Image> getIcons();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Image} and appends it to the '<em><b>Icon</b></em>' containment reference list.
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNameNotClash(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where a stereotype’s property is an association end for an association other than a kind of extension, and the other end is not a stereotype, the other end must be owned by the association itself.
	 * ownedAttribute
	 * ->select(association->notEmpty() and not association.oclIsKindOf(Extension) and not type.oclIsKindOf(Stereotype))
	 * ->forAll(opposite.owner = association)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateAssociationEndOwnership(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound of base-properties is exactly 1.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBasePropertyUpperBound(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Stereotype extends only one metaclass, the multiplicity of the corresponding base-property shall be 1..1.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBasePropertyMultiplicitySingleExtension(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Stereotype extends more than one metaclass, the multiplicity of the corresponding base-properties shall be [0..1]. At any point in time, only one of these base-properties can contain a metaclass instance during runtime.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBasePropertyMultiplicityMultipleExtension(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Stereotype may only generalize or specialize another Stereotype.
	 * allParents()->forAll(oclIsKindOf(Stereotype)) 
	 * and Classifier.allInstances()->forAll(c | c.allParents()->exists(oclIsKindOf(Stereotype)) implies c.oclIsKindOf(Stereotype))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateGeneralize(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (required) extension of the specified metaclass with this stereotype.
	 * @param metaclass The metaclass for the new extension.
	 * @param isRequired Whether the new extension should be required.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" metaclassRequired="true" metaclassOrdered="false" isRequiredDataType="org.eclipse.uml2.types.Boolean" isRequiredRequired="true" isRequiredOrdered="false"
	 * @generated
	 */
	Extension createExtension(org.eclipse.uml2.uml.Class metaclass,
			boolean isRequired);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The profile that directly or indirectly contains this stereotype.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getStereotype_Profile()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotypes may only participate in binary associations.
	 * ownedAttribute.association->forAll(memberEnd->size()=2)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateBinaryAssociationsOnly(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the localized keyword for this stereotype.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getKeyword();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the keyword for this stereotype, localized if indicated.
	 * @param localize Whether to localize the keyword.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" localizeDataType="org.eclipse.uml2.types.Boolean" localizeRequired="true" localizeOrdered="false"
	 * @generated
	 */
	String getKeyword(boolean localize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingProfile returns the closest profile directly or indirectly containing this stereotype.
	 * result = (self.namespace.oclAsType(Package).containingProfile())
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Profile containingProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the metaclasses extended by this stereotype.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getExtendedMetaclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the metaclasses extended by this stereotype, including the metaclasses extended by its superstereotypes.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getAllExtendedMetaclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the current definition (Ecore representation) of this stereotype.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an icon with the specified location for this stereotype.
	 * @param location The location for the new icon.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" locationDataType="org.eclipse.uml2.types.String" locationRequired="true" locationOrdered="false"
	 * @generated
	 */
	Image createIcon(String location);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an icon with the specified format and content for this stereotype.
	 * @param format The format for the new icon.
	 * @param content The content for the new icon.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" formatDataType="org.eclipse.uml2.types.String" formatRequired="true" formatOrdered="false" contentDataType="org.eclipse.uml2.types.String" contentRequired="true" contentOrdered="false"
	 * @generated
	 */
	Image createIcon(String format, String content);

} // Stereotype
