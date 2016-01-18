/*
 * Copyright (c) 2005, 2016 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *   Christian W. Damus (CEA) - 251963
 *
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
 * <p>From package UML::Packages.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getMetaclassReferences <em>Metaclass Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getMetamodelReferences <em>Metamodel Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile
		extends org.eclipse.uml2.uml.Package {

	/**
	 * Returns the value of the '<em><b>Metaclass Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ElementImport}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getElementImports() <em>Element Import</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a metaclass that may be extended.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metaclass Reference</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfile_MetaclassReference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ElementImport> getMetaclassReferences();

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
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getPackageImports() <em>Package Import</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a package containing (directly or indirectly) metaclasses that may be extended.
	 * <p>From package UML::Packages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metamodel Reference</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getProfile_MetamodelReference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PackageImport> getMetamodelReferences();

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
			org.eclipse.uml2.uml.Package importedPackage,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element imported as a metaclassReference is not specialized or generalized in a Profile.
	 * metaclassReference.importedElement->
	 * 	select(c | c.oclIsKindOf(Classifier) and
	 * 		(c.oclAsType(Classifier).allParents()->collect(namespace)->includes(self)))->isEmpty()
	 * and 
	 * packagedElement->
	 *     select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier).allParents())->
	 *        intersection(metaclassReference.importedElement->select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier)))->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMetaclassReferenceNotSpecialized(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All elements imported either as metaclassReferences or through metamodelReferences are members of the same base reference metamodel.
	 * metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages()->
	 *   union(metaclassReference.importedElement.allOwningPackages() )->notEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateReferencesSameMetamodel(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates and returns an instance of (the Ecore representation of) the specified classifier defined in this profile.
	 * @param classifier The classifier of which to create an instance.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" classifierRequired="true" classifierOrdered="false"
	 * @generated
	 */
	EObject create(Classifier classifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this profile is defined.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDefined();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines this profile by (re)creating Ecore representations of its current contents.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EPackage define();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines this profile by (re)creating Ecore representations of its current contents, using the specified options, diagnostics, and context.
	 * @param options The options to use.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" optionsRequired="true" optionsOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false" contextRequired="true" contextOrdered="false"
	 * @generated
	 */
	EPackage define(Map<String, String> options, DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the current definition (Ecore representation) of this profile.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EPackage getDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the current definition (Ecore representation) of the specified named element in this profile.
	 * @param namedElement The named element whose definition to retrieve.
	 * <!-- end-model-doc -->
	 * @model ordered="false" namedElementRequired="true" namedElementOrdered="false"
	 * @generated
	 */
	ENamedElement getDefinition(NamedElement namedElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the metaclasses referenced by this profile.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Class> getReferencedMetaclasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the metamodels referenced by this profile.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Model> getReferencedMetamodels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the extensions owned by this profile, excluding non-required extensions if indicated.
	 * @param requiredOnly Whether to retrieve only required extensions.
	 * <!-- end-model-doc -->
	 * @model ordered="false" requiredOnlyDataType="org.eclipse.uml2.types.Boolean" requiredOnlyRequired="true" requiredOnlyOrdered="false"
	 * @generated
	 */
	EList<Extension> getOwnedExtensions(boolean requiredOnly);

} // Profile
