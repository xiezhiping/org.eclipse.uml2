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
 * $Id: ElementOperations.java,v 1.3 2005/11/30 21:43:11 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.uml.Element;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class ElementOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element may not directly or indirectly own itself.
	 * not self.allOwnedElements()->includes(self)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotOwnSelf(Element element,
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
						UMLValidator.ELEMENT__NOT_OWN_SELF,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNotOwnSelf", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(element, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{element}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements that must be owned must have an owner.
	 * self.mustBeOwned() implies owner->notEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasOwner(Element element,
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
						UMLValidator.ELEMENT__HAS_OWNER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateHasOwner", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(element, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{element}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwnedElements() gives all of the direct and indirect owned elements of an element.
	 * result = ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static List allOwnedElements(Element element) {
		List ownedElements = element.getOwnedElements();
		List allOwnedElements = new UniqueEList(ownedElements);

		for (Iterator i = ownedElements.iterator(); i.hasNext();) {
			allOwnedElements.addAll(((Element) i.next()).allOwnedElements());
		}

		return Collections.unmodifiableList(allOwnedElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether elements of this type must have an owner. Subclasses of Element that do not require an owner must override this operation.
	 * result = true
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean mustBeOwned(Element element) {
		return true;
	}

} // ElementOperations