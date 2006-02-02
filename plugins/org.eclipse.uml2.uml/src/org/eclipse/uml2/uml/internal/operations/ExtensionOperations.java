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
 * $Id: ExtensionOperations.java,v 1.10 2006/02/02 19:23:40 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Extension</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Extension#validateNonOwnedEnd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#validateIsBinary(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Is Binary</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#getStereotypeEnd() <em>Get Stereotype End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#getStereotype() <em>Get Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#metaclassEnd() <em>Metaclass End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#getMetaclass() <em>Get Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extension#isRequired() <em>Is Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionOperations
		extends AssociationOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The non-owned end of an Extension is typed by a Class.
	 * metaclassEnd()->notEmpty() and metaclass()->oclIsKindOf(Class)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonOwnedEnd(Extension extension,
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
						UMLValidator.EXTENSION__NON_OWNED_END,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNonOwnedEnd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(extension, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{extension}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Extension is binary, i.e., it has only two memberEnds.
	 * memberEnd->size() = 2
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIsBinary(Extension extension,
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
						UMLValidator.EXTENSION__IS_BINARY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateIsBinary", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(extension, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{extension}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Property getStereotypeEnd(Extension extension) {

		for (Iterator ownedEnds = extension.getOwnedEnds().iterator(); ownedEnds
			.hasNext();) {

			return (Property) ownedEnds.next();
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Stereotype getStereotype(Extension extension) {
		Property stereotypeEnd = extension.getStereotypeEnd();

		if (stereotypeEnd != null) {
			Type type = stereotypeEnd.getType();

			if (type instanceof Stereotype) {
				return (Stereotype) type;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query metaclassEnd() returns the Property that is typed by a metaclass (as opposed to a stereotype).
	 * result = memberEnd->reject(ownedEnd)
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Property metaclassEnd(Extension extension) {
		EList ownedEnds = extension.getOwnedEnds();

		for (Iterator memberEnds = extension.getMemberEnds().iterator(); memberEnds
			.hasNext();) {

			Property memberEnd = (Property) memberEnds.next();

			if (!ownedEnds.contains(memberEnd)) {
				return memberEnd;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query metaclass() returns the metaclass that is being extended (as opposed to the extending stereotype).
	 * result = metaclassEnd().type
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static org.eclipse.uml2.uml.Class getMetaclass(Extension extension) {
		Property metaclassEnd = extension.metaclassEnd();

		if (metaclassEnd != null) {
			Object type = metaclassEnd.eGet(
				UMLPackage.Literals.TYPED_ELEMENT__TYPE, false);

			if (type instanceof org.eclipse.uml2.uml.Class) {
				return (org.eclipse.uml2.uml.Class) type;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRequired() is true if the owned end has a multiplicity with the lower bound of 1.
	 * result = (ownedEnd->lowerBound() = 1)
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isRequired(Extension extension) {
		EList ownedEnds = extension.getOwnedEnds();
		return ownedEnds.size() > 0
			&& ((ExtensionEnd) ownedEnds.get(0)).lowerBound() == 1;
	}

} // ExtensionOperations