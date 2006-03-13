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
 * $Id: RedefinableElementOperations.java,v 1.7 2006/03/13 20:50:41 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Redefinable Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.uml.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedefinableElementOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least one of the redefinition contexts of the redefining element must be a specialization of at least one of the redefinition contexts for each redefined element.
	 * self.redefinedElement->forAll(e | self.isRedefinitionContextValid(e))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRedefinitionContextValid(
			RedefinableElement redefinableElement, DiagnosticChain diagnostics,
			Map context) {
		boolean result = true;

		for (Iterator redefinedElements = redefinableElement
			.getRedefinedElements().iterator(); redefinedElements.hasNext();) {

			RedefinableElement redefinedElement = (RedefinableElement) redefinedElements
				.next();

			if (!redefinableElement
				.isRedefinitionContextValid(redefinedElement)) {

				result = false;

				if (diagnostics == null) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							UMLValidator.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_RedefinableElement_RedefinitionContextValid_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										redefinableElement, redefinedElement)),
							new Object[]{redefinableElement, redefinedElement}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A redefining element must be consistent with each redefined element.
	 * self.redefinedElement->forAll(re | re.isConsistentWith(self))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRedefinitionConsistent(
			RedefinableElement redefinableElement, DiagnosticChain diagnostics,
			Map context) {
		boolean result = true;

		for (Iterator redefinedElements = redefinableElement
			.getRedefinedElements().iterator(); redefinedElements.hasNext();) {

			RedefinableElement redefinedElement = (RedefinableElement) redefinedElements
				.next();

			if (!redefinedElement.isConsistentWith(redefinableElement)) {
				result = false;

				if (diagnostics == null) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(
							Diagnostic.WARNING,
							UMLValidator.DIAGNOSTIC_SOURCE,
							UMLValidator.REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT,
							UMLPlugin.INSTANCE
								.getString(
									"_UI_RedefinableElement_RedefinitionConsistent_diagnostic", //$NON-NLS-1$
									getMessageSubstitutions(context,
										redefinableElement, redefinedElement)),
							new Object[]{redefinableElement, redefinedElement}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of this RedefinableElement are properly related to the redefinition contexts of the specified RedefinableElement to allow this element to redefine the other. By default at least one of the redefinition contexts of this element must be a specialization of at least one of the redefinition contexts of the specified element.
	 * result = redefinitionContext->exists(c | c.allParents()->includes(redefined.redefinitionContext)))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isRedefinitionContextValid(
			RedefinableElement redefinableElement,
			RedefinableElement redefinable) {
		EList redefinableRedefinitionContexts = redefinable
			.getRedefinitionContexts();

		for (Iterator redefinitionContexts = redefinableElement
			.getRedefinitionContexts().iterator(); redefinitionContexts
			.hasNext();) {

			EList redefinitionContextAllParents = ((Classifier) redefinitionContexts
				.next()).allParents();

			for (Iterator rrc = redefinableRedefinitionContexts.iterator(); rrc
				.hasNext();) {

				Classifier redefinableRedefinitionContext = (Classifier) rrc
					.next();

				if (redefinitionContextAllParents
					.contains(redefinableRedefinitionContext)) {

					return true;
				}
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two RedefinableElements in a context in which redefinition is possible, whether redefinition would be logically consistent. By default, this is false; this operation must be overridden for subclasses of RedefinableElement to define the consistency conditions.
	 * redefinee.isRedefinitionContextValid(self)
	 * 
	 * 
	 * result = false
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(
			RedefinableElement redefinableElement, RedefinableElement redefinee) {
		return false;
	}

} // RedefinableElementOperations