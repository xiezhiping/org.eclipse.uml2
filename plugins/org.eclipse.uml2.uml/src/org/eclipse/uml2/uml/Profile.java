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
 * $Id: Profile.java,v 1.12 2006/05/12 20:38:03 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A profile defines limited extensions to a reference metamodel with the purpose of adapting the metamodel to a specific platform or domain.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getOwnedStereotypes <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getMetaclassReferences <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getMetamodelReferences <em>Metamodel Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile
		extends org.eclipse.uml2.uml.Package {

	/**
	 * Returns the value of the '<em><b>Owned Stereotype</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Stereotypes that are owned by the Profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Stereotype</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfile_OwnedStereotype()
	 * @model type="org.eclipse.uml2.uml.Stereotype" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getOwnedStereotypes();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Stereotype}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Stereotype}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Stereotype}.
	 * @see #getOwnedStereotypes()
	 * @generated
	 */
	Stereotype createOwnedStereotype(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Stereotype} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Stereotype} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Stereotype} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedStereotypes()
	 * @generated
	 */
	Stereotype getOwnedStereotype(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Stereotype} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Stereotype} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Stereotype} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Stereotype} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedStereotypes()
	 * @generated
	 */
	Stereotype getOwnedStereotype(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Metaclass Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ElementImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a metaclass that may be extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metaclass Reference</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfile_MetaclassReference()
	 * @model type="org.eclipse.uml2.uml.ElementImport" ordered="false"
	 * @generated
	 */
	EList getMetaclassReferences();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ElementImport}, with the specified '<em><b>Imported Element</b></em>', and appends it to the '<em><b>Metaclass Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedElement The '<em><b>Imported Element</b></em>' for the new {@link org.eclipse.uml2.uml.ElementImport}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.ElementImport}.
	 * @see #getMetaclassReferences()
	 * @generated
	 */
	ElementImport createMetaclassReference(PackageableElement importedElement);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ElementImport} with the specified '<em><b>Imported Element</b></em>' from the '<em><b>Metaclass Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedElement The '<em><b>Imported Element</b></em>' of the {@link org.eclipse.uml2.uml.ElementImport} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ElementImport} with the specified '<em><b>Imported Element</b></em>', or <code>null</code>.
	 * @see #getMetaclassReferences()
	 * @generated
	 */
	ElementImport getMetaclassReference(PackageableElement importedElement);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ElementImport} with the specified '<em><b>Imported Element</b></em>' from the '<em><b>Metaclass Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedElement The '<em><b>Imported Element</b></em>' of the {@link org.eclipse.uml2.uml.ElementImport} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ElementImport} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ElementImport} with the specified '<em><b>Imported Element</b></em>', or <code>null</code>.
	 * @see #getMetaclassReferences()
	 * @generated
	 */
	ElementImport getMetaclassReference(PackageableElement importedElement,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Metamodel Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.PackageImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a package containing (directly or indirectly) metaclasses that may be extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metamodel Reference</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfile_MetamodelReference()
	 * @model type="org.eclipse.uml2.uml.PackageImport" ordered="false"
	 * @generated
	 */
	EList getMetamodelReferences();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.PackageImport}, with the specified '<em><b>Imported Package</b></em>', and appends it to the '<em><b>Metamodel Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedPackage The '<em><b>Imported Package</b></em>' for the new {@link org.eclipse.uml2.uml.PackageImport}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.PackageImport}.
	 * @see #getMetamodelReferences()
	 * @generated
	 */
	PackageImport createMetamodelReference(
			org.eclipse.uml2.uml.Package importedPackage);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageImport} with the specified '<em><b>Imported Package</b></em>' from the '<em><b>Metamodel Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedPackage The '<em><b>Imported Package</b></em>' of the {@link org.eclipse.uml2.uml.PackageImport} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.PackageImport} with the specified '<em><b>Imported Package</b></em>', or <code>null</code>.
	 * @see #getMetamodelReferences()
	 * @generated
	 */
	PackageImport getMetamodelReference(
			org.eclipse.uml2.uml.Package importedPackage);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.PackageImport} with the specified '<em><b>Imported Package</b></em>' from the '<em><b>Metamodel Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param importedPackage The '<em><b>Imported Package</b></em>' of the {@link org.eclipse.uml2.uml.PackageImport} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.PackageImport} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.PackageImport} with the specified '<em><b>Imported Package</b></em>', or <code>null</code>.
	 * @see #getMetamodelReferences()
	 * @generated
	 */
	PackageImport getMetamodelReference(
			org.eclipse.uml2.uml.Package importedPackage, boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element imported as a metaclassReference is not specialized or generalized in a Profile.
	 * self.metaclassReference.importedElement->
	 *   select(c | c.oclIsKindOf(Classifier) and
	 *     (c.generalization.namespace = self or
	 *       (c.specialization.namespace = self) )->isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMetaclassReferenceNotSpecialized(
			DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All elements imported either as metaclassReferences or through metamodelReferences are members of the same base reference metamodel.
	 * self.metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages())->
	 *   union(self.metaclassReference.importedElement.allOwningPackages() )->notEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateReferencesSameMetamodel(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" classifierRequired="true" classifierOrdered="false"
	 * @generated
	 */
	EObject create(Classifier classifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.uml.String" nameRequired="true" nameOrdered="false" isAbstractDataType="org.eclipse.uml2.uml.Boolean" isAbstractRequired="true" isAbstractOrdered="false"
	 * @generated
	 */
	Stereotype createOwnedStereotype(String name, boolean isAbstract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDefined();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EPackage define();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EPackage getDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" namedElementRequired="true" namedElementOrdered="false"
	 * @generated
	 */
	ENamedElement getDefinition(NamedElement namedElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Class" ordered="false"
	 * @generated
	 */
	EList getReferencedMetaclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Model" ordered="false"
	 * @generated
	 */
	EList getReferencedMetamodels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.eclipse.uml2.uml.Extension" ordered="false" requiredOnlyDataType="org.eclipse.uml2.uml.Boolean" requiredOnlyRequired="true" requiredOnlyOrdered="false"
	 * @generated
	 */
	EList getOwnedExtensions(boolean requiredOnly);

} // Profile
