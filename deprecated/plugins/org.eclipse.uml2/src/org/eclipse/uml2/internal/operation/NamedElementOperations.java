/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: NamedElementOperations.java,v 1.6 2004/05/11 15:24:01 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.util.UML2Validator;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.UML2Plugin;


/**
 * A static utility class that provides operations related to named elements.
 */
public final class NamedElementOperations
	extends UML2Operations {

	/**
	 * Constructs a new Named Element Operations. This constructor should never
	 * be called because this is a static utility class.
	 */
	private NamedElementOperations() {
		super();
	}

	public static List allNamespaces(NamedElement namedElement) {
		List allNamespaces = new ArrayList();

		if (null != namedElement.getNamespace()) {
			allNamespaces.addAll(namedElement.getNamespace().allNamespaces());
			allNamespaces.add(0, namedElement.getNamespace());
		}

		return allNamespaces;
	}

	public static boolean isDistinguishableFrom(NamedElement namedElement,
			NamedElement n, Namespace ns) {

		if (n.eClass().isSuperTypeOf(namedElement.eClass())
			|| namedElement.eClass().isSuperTypeOf(n.eClass())) {

			for (Iterator namesOfMember = ns.getNamesOfMember(namedElement)
				.iterator(); namesOfMember.hasNext();) {

				if (ns.getNamesOfMember(n).contains(namesOfMember.next())) {
					return false;
				}
			}
		}

		return true;
	}

	public static String qualifiedName(NamedElement namedElement) {

		if (isEmpty(namedElement.getName())) {
			return EMPTY_STRING;
		}

		String qualifiedName = namedElement.getName();

		for (Iterator allNamespaces = namedElement.allNamespaces().iterator(); allNamespaces
			.hasNext();) {

			Namespace namespace = (Namespace) allNamespaces.next();

			if (isEmpty(namespace.getName())) {
				return EMPTY_STRING;
			} else {
				qualifiedName = namespace.getName() + namedElement.separator()
					+ qualifiedName;
			}
		}

		return qualifiedName;
	}

	public static String separator(NamedElement namedElement) {
		return NamedElement.SEPARATOR;
	}

	/**
	 * If there is no name, or one of the containing namespaces has no name,
	 * there is no qualified name.
	 *  
	 */
	public static boolean validateNoName(NamedElement namedElement,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (isEmpty(namedElement.getName())) {
			result = isEmpty(namedElement.qualifiedName());
		} else {

			for (Iterator allNamespaces = namedElement.allNamespaces()
				.iterator(); allNamespaces.hasNext();) {

				if (isEmpty(((Namespace) allNamespaces.next()).getName())) {
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
					new Object[] {namedElement}));
		}

		return result;
	}

	/**
	 * When there is a name, and all of the containing namespaces have a name,
	 * the qualified name is constructed from the names of the containing
	 * namespaces.
	 *  
	 */
	public static boolean validateQualifiedName(NamedElement namedElement,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (!isEmpty(namedElement.getName())) {
			StringBuffer qualifiedName = new StringBuffer(namedElement
				.getName());

			for (Iterator allNamespaces = namedElement.allNamespaces()
				.iterator(); allNamespaces.hasNext();) {

				Namespace namespace = (Namespace) allNamespaces.next();

				if (isEmpty(namespace.getName())) {
					return result;
				} else {
					qualifiedName.insert(0, namedElement.separator());
					qualifiedName.insert(0, namespace.getName());
				}
			}

			if (!qualifiedName.toString().equals(namedElement.qualifiedName())) {
				result = false;

				if (null != diagnostics) {
					diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								UML2Validator.DIAGNOSTIC_SOURCE,
								UML2Validator.NAMED_ELEMENT__NO_NAME,
								UML2Plugin.INSTANCE
									.getString(
										"_UI_NamedElement_QualifiedName_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											namedElement)),
								new Object[] {namedElement}));
				}
			}
		}

		return result;
	}

	/**
	 * If a named element is not owned by a namespace, it does not have a
	 * visibility.
	 *  
	 */
	public static boolean validateVisibilityNeedsOwnership(
			NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (null == namedElement.getNamespace()
			&& namedElement.eIsSet(UML2Package.eINSTANCE
				.getNamedElement_Visibility())) {

			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UML2Validator.DIAGNOSTIC_SOURCE,
							UML2Validator.NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP,
							UML2Plugin.INSTANCE
								.getString(
									"_UI_NamedElement_VisibilityNeedsOwnership_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										namedElement)),
							new Object[] {namedElement}));
			}
		}

		return result;
	}

}