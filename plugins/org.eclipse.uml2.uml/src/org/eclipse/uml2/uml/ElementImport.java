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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ElementImport identifies a NamedElement in a Namespace other than the one that owns that NamedElement and allows the NamedElement to be referenced using an unqualified name in the Namespace owning the ElementImport.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ElementImport#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getElementImport()
 * @model
 * @generated
 */
public interface ElementImport
		extends DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the visibility of the imported PackageableElement within the importingNamespace, i.e., whether the  importedElement will in turn be visible to other Namespaces. If the ElementImport is public, the importedElement will be visible outside the importingNamespace while, if the ElementImport is private, it will not.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2.uml.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getElementImport_Visibility()
	 * @model default="public" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ElementImport#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2.uml.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the name that should be added to the importing Namespace in lieu of the name of the imported PackagableElement. The alias must not clash with any other member in the importing Namespace. By default, no alias is used.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #isSetAlias()
	 * @see #unsetAlias()
	 * @see #setAlias(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getElementImport_Alias()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ElementImport#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #isSetAlias()
	 * @see #unsetAlias()
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.ElementImport#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlias()
	 * @see #getAlias()
	 * @see #setAlias(String)
	 * @generated
	 */
	void unsetAlias();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.ElementImport#getAlias <em>Alias</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alias</em>' attribute is set.
	 * @see #unsetAlias()
	 * @see #getAlias()
	 * @see #setAlias(String)
	 * @generated
	 */
	boolean isSetAlias();

	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the PackageableElement whose name is to be added to a Namespace.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Element</em>' reference.
	 * @see #setImportedElement(PackageableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getElementImport_ImportedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PackageableElement getImportedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ElementImport#getImportedElement <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Element</em>' reference.
	 * @see #getImportedElement()
	 * @generated
	 */
	void setImportedElement(PackageableElement value);

	/**
	 * Returns the value of the '<em><b>Importing Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Namespace#getElementImports <em>Element Import</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Namespace that imports a PackageableElement from another Namespace.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importing Namespace</em>' container reference.
	 * @see #setImportingNamespace(Namespace)
	 * @see org.eclipse.uml2.uml.UMLPackage#getElementImport_ImportingNamespace()
	 * @see org.eclipse.uml2.uml.Namespace#getElementImports
	 * @model opposite="elementImport" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getImportingNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ElementImport#getImportingNamespace <em>Importing Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Namespace</em>' container reference.
	 * @see #getImportingNamespace()
	 * @generated
	 */
	void setImportingNamespace(Namespace value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of an ElementImport is either public or private.
	 * visibility = VisibilityKind::public or visibility = VisibilityKind::private
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateVisibilityPublicOrPrivate(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An importedElement has either public visibility or no visibility at all.
	 * importedElement.visibility <> null implies importedElement.visibility = VisibilityKind::public
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateImportedElementIsPublic(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query getName() returns the name under which the imported PackageableElement will be known in the importing namespace.
	 * result = (if alias->notEmpty() then
	 *   alias
	 * else
	 *   importedElement.name
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

} // ElementImport
