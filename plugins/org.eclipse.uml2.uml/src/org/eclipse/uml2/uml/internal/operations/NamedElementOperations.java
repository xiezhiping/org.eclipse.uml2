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
 * $Id: NamedElementOperations.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Named Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateNoName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateVisibilityNeedsOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Needs Ownership</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#qualifiedName() <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#allNamespaces() <em>All Namespaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#separator() <em>Separator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NamedElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is no name, or one of the containing namespaces has no name, there is no qualified name.
	 * (self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())
	 * 
	 *   implies self.qualifiedName->isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoName(NamedElement namedElement,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.NAMED_ELEMENT__NO_NAME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(namedElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{namedElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing namespaces have a name, the qualified name is constructed from the names of the containing namespaces.
	 * (self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies
	 *   self.qualifiedName = self.allNamespaces()->iterate( ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateQualifiedName(NamedElement namedElement,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.NAMED_ELEMENT__QUALIFIED_NAME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateQualifiedName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(namedElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{namedElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a NamedElement is not owned by a Namespace, it does not have a visibility.
	 * namespace->isEmpty() implies visibility->isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVisibilityNeedsOwnership(
			NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateVisibilityNeedsOwnership", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(namedElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{namedElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing namespaces have a name, the qualified name is constructed from the names of the containing namespaces.
	 * result = if self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()
	 * then 
	 *     self.allNamespaces()->iterate( ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))
	 * else
	 *     Set{}
	 * endif
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static String qualifiedName(NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

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
	 * @generated
	 */
	public static List allNamespaces(NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

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
	 * @generated
	 */
	public static boolean isDistinguishableFrom(NamedElement namedElement,
			NamedElement n, Namespace ns) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query separator() gives the string that is used to separate names when constructing a qualified name.
	 * result = '::'
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static String separator(NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // NamedElementOperations