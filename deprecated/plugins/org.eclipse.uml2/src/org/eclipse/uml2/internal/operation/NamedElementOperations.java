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
 * $Id: NamedElementOperations.java,v 1.13 2005/10/19 19:37:57 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.Dependency;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Named Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.NamedElement#validateNoName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#validateQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#allNamespaces() <em>All Namespaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#isDistinguishableFrom(org.eclipse.uml2.NamedElement, org.eclipse.uml2.Namespace) <em>Is Distinguishable From</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#separator() <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#qualifiedName() <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.NamedElement#validateVisibilityNeedsOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Needs Ownership</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class NamedElementOperations extends UML2Operations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

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
	 * If there is no name, or one of the containing namespaces has no name,
	 * there is no qualified name.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty()
	 * 	implies self.qualifiedName->isEmpty()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNoName(NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (isEmpty(namedElement.getName())) {
			result = isEmpty(namedElement.qualifiedName());
		} else {

			for (Iterator allNamespaces = namedElement.allNamespaces()
				.iterator(); allNamespaces.hasNext();) {

				if (isEmpty(((Namespace) allNamespaces.next())
					.getName())) {

					result = isEmpty(namedElement.qualifiedName());
					break;
				}
			}
		}

		if (!result && null != diagnostics) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
				UML2Validator.DIAGNOSTIC_SOURCE,
				UML2Validator.NAMED_ELEMENT__NO_NAME,
				UML2Plugin.INSTANCE.getString(
					"_UI_NamedElement_NoName_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, namedElement)),
				new Object[]{namedElement}));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * When there is a name, and all of the containing namespaces have a name,
	 * the qualified name is constructed from the names of the containing
	 * namespaces.
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
	 * @generated NOT
	 */
	public static boolean validateQualifiedName(NamedElement namedElement,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		String name = namedElement.getName();

		if (!isEmpty(name)) {
			StringBuffer qualifiedName = new StringBuffer(name);

			for (Iterator allNamespaces = namedElement.allNamespaces()
				.iterator(); allNamespaces.hasNext();) {

				String namespaceName = ((Namespace) allNamespaces.next())
					.getName();

				if (isEmpty(namespaceName)) {
					return result;
				} else {
					qualifiedName.insert(0, namedElement.separator());
					qualifiedName.insert(0, namespaceName);
				}
			}

			if (!qualifiedName.toString().equals(namedElement.qualifiedName())) {
				result = false;

				if (null != diagnostics) {
					diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
						UML2Validator.DIAGNOSTIC_SOURCE,
						UML2Validator.NAMED_ELEMENT__NO_NAME,
						UML2Plugin.INSTANCE.getString(
							"_UI_NamedElement_QualifiedName_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, namedElement)),
						new Object[]{namedElement}));
				}
			}
		}

		return result;
	}

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
	 * @generated NOT
	 */
	public static List allNamespaces(NamedElement namedElement) {
		List allNamespaces = new ArrayList();

		Namespace namespace = namedElement.getNamespace();

		if (null != namespace) {
			allNamespaces.addAll(namespace.allNamespaces());
			allNamespaces.add(0, namespace);
		}

		return Collections.unmodifiableList(allNamespaces);
	}

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
	 * @generated NOT
	 */
	public static boolean isDistinguishableFrom(NamedElement namedElement,
			NamedElement n, Namespace ns) {
		EClass eClass = namedElement.eClass();
		EClass nEClass = n.eClass();

		if (nEClass.isSuperTypeOf(eClass) || eClass.isSuperTypeOf(nEClass)) {
			Set namesOfN = ns.getNamesOfMember(n);

			for (Iterator namesOfMember = ns.getNamesOfMember(namedElement)
				.iterator(); namesOfMember.hasNext();) {

				if (namesOfN.contains(namesOfMember.next())) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * '::'
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String separator(NamedElement namedElement) {
		return NamedElement.SEPARATOR;
	}

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
	 * @generated NOT
	 */
	public static String qualifiedName(NamedElement namedElement) {
		String name = namedElement.getName();

		if (isEmpty(name)) {
			return EMPTY_STRING;
		}

		StringBuffer qualifiedName = new StringBuffer(name);

		for (Iterator allNamespaces = namedElement.allNamespaces().iterator(); allNamespaces
			.hasNext();) {

			String namespaceName = ((Namespace) allNamespaces.next()).getName();

			if (isEmpty(namespaceName)) {
				return EMPTY_STRING;
			} else {
				qualifiedName.insert(0, namedElement.separator());
				qualifiedName.insert(0, namespaceName);
			}
		}

		return qualifiedName.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * If a named element is not owned by a namespace, it does not have a
	 * visibility.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * namespace->isEmpty() implies visibility->isEmpty()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateVisibilityNeedsOwnership(NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (null == namedElement.getNamespace()
			&& namedElement.eIsSet(UML2Package.eINSTANCE
				.getNamedElement_Visibility())) {

			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP,
					UML2Plugin.INSTANCE.getString(
						"_UI_NamedElement_VisibilityNeedsOwnership_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, namedElement)),
					new Object[]{namedElement}));
			}
		}

		return result;
	}

	// <!-- begin-custom-operations -->

	protected static final String LABEL_KEY_PREFIX = "_label_"; //$NON-NLS-1$

	/**
	 * Retrieves a localized label for the specified named element.
	 * 
	 * @param namedElement
	 *            The named element for which to retrieve a localized label.
	 * @return A localized label for the named element.
	 */
	public static String getLabel(NamedElement namedElement) {
		return getLabel(namedElement, true);
	}

	/**
	 * Retrieves a label for the specified named element, localized if
	 * indicated.
	 * 
	 * @param namedElement
	 *            The named element for which to retrieve a (localized) label.
	 * @param localize
	 *            Whether the label should be localized.
	 * @return A (localized) label for the named element.
	 */
	public static String getLabel(NamedElement namedElement, boolean localize) {
		String label = EMPTY_STRING;

		if (null != namedElement) {
			label = UML2Operations.getString(namedElement, LABEL_KEY_PREFIX
				+ getValidIdentifier(namedElement.getQualifiedName().replace(
					':', '_')), namedElement.getName(), localize);
		}

		return label;
	}

	/**
	 * Creates a dependency between the specified client and supplier, owned by
	 * the client's nearest package.
	 * 
	 * @param client
	 *            The client for the dependency.
	 * @param supplier
	 *            The supplier for the dependency.
	 * @return The new dependency.
	 * @exception IllegalArgumentException
	 *                If the client is not directly or indirectly owned by a
	 *                package.
	 */
	public static Dependency createDependency(NamedElement client,
			NamedElement supplier) {

		if (null == client) {
			throw new IllegalArgumentException(String.valueOf(client));
		}

		org.eclipse.uml2.Package package_ = client.getNearestPackage();

		if (null == package_) {
			throw new IllegalArgumentException(String.valueOf(client));
		}

		if (null == supplier) {
			throw new IllegalArgumentException(String.valueOf(supplier));
		}

		Dependency dependency = (Dependency) package_
			.createOwnedMember(UML2Package.eINSTANCE.getDependency());

		dependency.getClients().add(client);
		dependency.getSuppliers().add(supplier);

		return dependency;
	}

	// <!-- end-custom-operations -->

} // NamedElementOperations