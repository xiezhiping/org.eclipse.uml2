/*
 * Copyright (c) 2005, 2015 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 205188
 *   Kenn Hussey (CEA) - 327039, 418466, 433211, 451350
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
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A NamedElement is an Element in a model that may have a name. The name may be given directly and/or via the use of a StringExpression.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement
		extends Element {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the NamedElement.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_Name()
	 * @model unsettable="true" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.NamedElement#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether and how the NamedElement is visible outside its owning Namespace.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2.uml.VisibilityKind
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_Visibility()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.NamedElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2.uml.VisibilityKind
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.uml2.uml.NamedElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.uml2.uml.NamedElement#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityKind)
	 * @generated
	 */
	boolean isSetVisibility();

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name that allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing Namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_QualifiedName()
	 * @model dataType="org.eclipse.uml2.types.String" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the Dependencies that reference this NamedElement as a client.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Dependency</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_ClientDependency()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Dependency> getClientDependencies();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Dependency} with the specified '<em><b>Name</b></em>' from the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Dependency} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Dependency} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getClientDependencies()
	 * @generated
	 */
	Dependency getClientDependency(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Dependency} with the specified '<em><b>Name</b></em>' from the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Dependency} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Dependency} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Dependency} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getClientDependencies()
	 * @generated
	 */
	Dependency getClientDependency(String name, boolean ignoreCase,
			EClass eClass);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers <em>Owned Member</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Namespace that owns the NamedElement.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_Namespace()
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedMembers
	 * @model opposite="ownedMember" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Returns the value of the '<em><b>Name Expression</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StringExpression used to define the name of this NamedElement.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Expression</em>' containment reference.
	 * @see #setNameExpression(StringExpression)
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_NameExpression()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	StringExpression getNameExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.NamedElement#getNameExpression <em>Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Expression</em>' containment reference.
	 * @see #getNameExpression()
	 * @generated
	 */
	void setNameExpression(StringExpression value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.StringExpression},with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and sets the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.StringExpression}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.StringExpression}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.StringExpression}.
	 * @see #getNameExpression()
	 * @generated
	 */
	StringExpression createNameExpression(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is no name, or one of the containing Namespaces has no name, there is no qualifiedName.
	 * name=null or allNamespaces()->select( ns | ns.name=null )->notEmpty() implies qualifiedName = null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateHasNoQualifiedName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing Namespaces have a name, the qualifiedName is constructed from the name of the NamedElement and the names of the containing Namespaces.
	 * (name <> null and allNamespaces()->select(ns | ns.name = null)->isEmpty()) implies
	 *   qualifiedName = allNamespaces()->iterate( ns : Namespace; agg: String = name | ns.name.concat(self.separator()).concat(agg))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateHasQualifiedName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a NamedElement is owned by something other than a Namespace, it does not have a visibility. One that is not owned by anything (and hence must be a Package, as this is the only kind of NamedElement that overrides mustBeOwned()) may have a visibility.
	 * (namespace = null and owner <> null) implies visibility = null
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateVisibilityNeedsOwnership(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a dependency between this named element and the specified supplier, owned by this named element's nearest package.
	 * @param supplier The supplier for the new dependency.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" supplierRequired="true" supplierOrdered="false"
	 * @generated
	 */
	Dependency createDependency(NamedElement supplier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves a localized label for this named element.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves a label for this named element, localized if indicated.
	 * @param localize Whether to localize the label.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" localizeDataType="org.eclipse.uml2.types.Boolean" localizeRequired="true" localizeOrdered="false"
	 * @generated
	 */
	String getLabel(boolean localize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a usage between this named element and the specified supplier, owned by this named element's nearest package.
	 * @param supplier The supplier for the new usage.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" supplierRequired="true" supplierOrdered="false"
	 * @generated
	 */
	Usage createUsage(NamedElement supplier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allNamespaces() gives the sequence of Namespaces in which the NamedElement is nested, working outwards.
	 * result = (
	 * if owner = null
	 *   then OrderedSet{}
	 * else
	 *   let enclosingNamespace : Namespace =
	 *     if owner.oclIsKindOf(TemplateParameter) and owner.oclAsType(TemplateParameter).signature.template.oclIsKindOf(Namespace)
	 *       then owner.oclAsType(TemplateParameter).signature.template.oclAsType(Namespace)
	 *     else
	 *       namespace
	 *     endif
	 *   in enclosingNamespace.allNamespaces()->prepend(enclosingNamespace)
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Namespace> allNamespaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() determines whether two NamedElements may logically co-exist within a Namespace. By default, two named elements are distinguishable if (a) they have types neither of which is a kind of the other or (b) they have different names.
	 * result = ((self.oclIsKindOf(n.oclType()) or n.oclIsKindOf(self.oclType())) implies
	 *     ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()
	 * )
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" nRequired="true" nOrdered="false" nsRequired="true" nsOrdered="false"
	 * @generated
	 */
	boolean isDistinguishableFrom(NamedElement n, Namespace ns);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query separator() gives the string that is used to separate names when constructing a qualifiedName.
	 * result = ('::')
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String separator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwningPackages() returns the set of all the enclosing Namespaces of this NamedElement, working outwards, that are Packages, up to but not including the first such Namespace that is not a Package.
	 * result = (if namespace.oclIsKindOf(Package)
	 * then
	 *   let owningPackage : Package = namespace.oclAsType(Package) in
	 *     owningPackage->union(owningPackage.allOwningPackages())
	 * else
	 *   null
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<org.eclipse.uml2.uml.Package> allOwningPackages();

	String SEPARATOR = "::"; //$NON-NLS-1$

} // NamedElement
