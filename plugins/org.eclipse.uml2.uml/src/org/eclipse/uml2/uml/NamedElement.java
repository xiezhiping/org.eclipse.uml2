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
 * $Id: NamedElement.java,v 1.2 2005/11/16 19:03:05 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NamedElement has a visibility attribute.
 * A named element represents elements that may have a name. The name is used for identification of the named element within the namespace in which it is defined. A named element also has a qualified name that allows it to be unambiguously identified within a hierarchy of nested namespaces. NamedElement is an abstract metaclass.
 * NamedElement specializes Kernel::NamedElement and adds a composition association to Expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getNameExpression <em>Name Expression</em>}</li>
 * </ul>
 * </p>
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_Name()
	 * @model id="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines where the NamedElement appears within different Namespaces within the overall model, and its accessibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2.uml.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_Visibility()
	 * @model ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.NamedElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2.uml.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name which allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_QualifiedName()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Dependency}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Dependency#getClients <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the dependencies that reference the client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Dependency</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_ClientDependency()
	 * @see org.eclipse.uml2.uml.Dependency#getClients
	 * @model type="org.eclipse.uml2.uml.Dependency" opposite="client" ordered="false"
	 * @generated
	 */
	List getClientDependencies();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Dependency} with the specified '<em><b>Name</b></em>' from the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Dependency} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Dependency} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getClientDependencies()
	 * @generated
	 */
	Dependency getClientDependency(String name);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the namespace that owns the NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_Namespace()
	 * @see org.eclipse.uml2.uml.Namespace#getOwnedMembers
	 * @model opposite="ownedMember" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Returns the value of the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string expression used to define the name of this named element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Expression</em>' containment reference.
	 * @see #setNameExpression(StringExpression)
	 * @see org.eclipse.uml2.uml.UMLPackage#getNamedElement_NameExpression()
	 * @model containment="true" resolveProxies="false" ordered="false"
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
	 * Creates a {@link org.eclipse.uml2.uml.StringExpression} and sets the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.StringExpression}.
	 * @see #getNameExpression()
	 * @generated
	 */
	StringExpression createNameExpression();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is no name, or one of the containing namespaces has no name, there is no qualified name.
	 * (self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())
	 * 
	 *   implies self.qualifiedName->isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoName(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing namespaces have a name, the qualified name is constructed from the names of the containing namespaces.
	 * (self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies
	 *   self.qualifiedName = self.allNamespaces()->iterate( ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateQualifiedName(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a NamedElement is not owned by a Namespace, it does not have a visibility.
	 * namespace->isEmpty() implies visibility->isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateVisibilityNeedsOwnership(DiagnosticChain diagnostics,
			Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allNamespaces() gives the sequence of namespaces in which the NamedElement is nested, working outwards.
	 * result = if self.namespace->isEmpty()
	 * then Sequence{}
	 * else self.namespace.allNamespaces()->prepend(self.namespace)
	 * endif
	 * <!-- end-model-doc -->
	 * @model type="org.eclipse.uml2.uml.Namespace"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	List allNamespaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() determines whether two NamedElements may logically co-exist within a Namespace. By default, two named elements are distinguishable if (a) they have unrelated types or (b) they have related types but different names.
	 * result = if self.oclIsKindOf(n.oclType) or n.oclIsKindOf(self.oclType)
	 * then ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()
	 * else true
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nRequired="true" nOrdered="false" nsRequired="true" nsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	boolean isDistinguishableFrom(NamedElement n, Namespace ns);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query separator() gives the string that is used to separate names when constructing a qualified name.
	 * result = '::'
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='spec'"
	 * @generated
	 */
	String separator();

} // NamedElement
