/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: NamedElement.java,v 1.9 2005/03/18 04:00:53 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.List;
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
 * A named element represents elements that may have a name. The name is used for identification of the named element within the namespace in which it is defined. A named element also has a qualified name that allows it to be unambiguously identified within a hierarchy of nested namespaces. NamedElement is an abstract metaclass. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#getNameExpression <em>Name Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends TemplateableElement{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.uml2.UML2Package#getNamedElement_Name()
	 * @model default="" dataType="org.eclipse.uml2.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name which allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself. This is a derived attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see org.eclipse.uml2.UML2Package#getNamedElement_QualifiedName()
	 * @model default="" dataType="org.eclipse.uml2.String" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the visibility of the NamedElement within different Namespaces within the overall model. Package Dependencies (“Dependencies” on page 94)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.eclipse.uml2.UML2Package#getNamedElement_Visibility()
	 * @model 
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.NamedElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Dependency}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Dependency#getClients <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Dependency</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getNamedElement_ClientDependency()
	 * @see org.eclipse.uml2.Dependency#getClients
	 * @model type="org.eclipse.uml2.Dependency" opposite="client" volatile="true" ordered="false"
	 * @generated
	 */
	EList getClientDependencies();

    /**
     * Retrieves the {@link org.eclipse.uml2.Dependency} with the specified name from the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Dependency} to retrieve.
	 * @return The {@link org.eclipse.uml2.Dependency} with the specified name, or <code>null</code>.
	 * @see #getClientDependencies()
	 * @generated
     */
    Dependency getClientDependency(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression used to define the name of this named element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Expression</em>' containment reference.
	 * @see #setNameExpression(StringExpression)
	 * @see org.eclipse.uml2.UML2Package#getNamedElement_NameExpression()
	 * @model containment="true"
	 * @generated
	 */
	StringExpression getNameExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.NamedElement#getNameExpression <em>Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Expression</em>' containment reference.
	 * @see #getNameExpression()
	 * @generated
	 */
	void setNameExpression(StringExpression value);

    /**
     * Creates a {@link org.eclipse.uml2.StringExpression} and sets the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.StringExpression} to create.
	 * @return The new {@link org.eclipse.uml2.StringExpression}.
	 * @see #getNameExpression()
	 * @generated
     */
    StringExpression createNameExpression(EClass eClass);
     
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty()
	 * 	implies self.qualifiedName->isEmpty()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateNoName(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * (self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies
	 * self.qualifiedName =
	 *  self.allNamespaces()->iterate( ns : Namespace; result: String = self.name |
	 * 		ns.name->union(self.separator())->union(result))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateQualifiedName(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if self.namespace->isEmpty()
	 * then Sequence{}
	 * else self.namespace.allNamespaces()->prepend(self.namespace)
	 * endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Sequence" 
	 * @generated
	 */
	List allNamespaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if self.oclIsKindOf(n.oclType) or n.oclIsKindOf(self.oclType)
	 * then ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()
	 * else true
	 * endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean isDistinguishableFrom(NamedElement n, Namespace ns);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * '::'
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.String" 
	 * @generated
	 */
	String separator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * if self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()
	 * then 
	 *     self.allNamespaces()->iterate( ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))
	 * else
	 *     Set{}
	 * endif
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.String" 
	 * @generated
	 */
	String qualifiedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * namespace->isEmpty() implies visibility->isEmpty()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean" 
	 * @generated
	 */
	boolean validateVisibilityNeedsOwnership(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	Element getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getOwnedElements();

	// <!-- begin-custom-operations -->

	public static final String SEPARATOR = "::"; //$NON-NLS-1$

	/**
	 * Retrieves a localized label for this named element.
	 * 
	 * @return A localized label for this named element.
	 */
	public String getLabel();

	/**
	 * Retrieves a label for this named element, localized if indicated.
	 * 
	 * @param localize
	 *            Whether the label should be localized.
	 * @return A (localized) label for this named element.
	 */
	public String getLabel(boolean localize);

	// <!-- end-custom-operations -->

} // NamedElement
