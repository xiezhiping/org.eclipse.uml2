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
 * $Id: RedefinableElementOperations.java,v 1.9 2005/05/18 16:38:32 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.UML2Plugin;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Redefinable Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionContextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Context Valid</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#validateRedefinitionConsistent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefinition Consistent</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isConsistentWith(org.eclipse.uml2.RedefinableElement) <em>Is Consistent With</em>}</li>
 *   <li>{@link org.eclipse.uml2.RedefinableElement#isRedefinitionContextValid(org.eclipse.uml2.RedefinableElement) <em>Is Redefinition Context Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class RedefinableElementOperations extends UML2Operations {

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
	private RedefinableElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * At least one of the redefinition contexts of the redefining element must
	 * be a specialization of at least one of the redefinition contexts for each
	 * redefined element.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.redefinedElement->forAll(e | self.isRedefinitionContextValid(e))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRedefinitionContextValid(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		for (Iterator redefinedElements = redefinableElement
			.getRedefinedElements().iterator(); redefinedElements.hasNext();) {

			RedefinableElement redefinedElement = (RedefinableElement) redefinedElements
				.next();

			if (!redefinableElement
				.isRedefinitionContextValid(redefinedElement)) {

				result = false;

				if (null == diagnostics) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UML2Validator.DIAGNOSTIC_SOURCE,
								UML2Validator.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID,
								UML2Plugin.INSTANCE
									.getString(
										"_UI_RedefinableElement_RedefinitionContextValid_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											redefinableElement,
											redefinedElement)),
								new Object[] {redefinableElement, redefinedElement}));
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * A redefining element must be consistent with each redefined element.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.redefinedElement->forAll(re | re.isConsistentWith(self))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRedefinitionConsistent(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		for (Iterator redefinedElements = redefinableElement
			.getRedefinedElements().iterator(); redefinedElements.hasNext();) {

			RedefinableElement redefinedElement = (RedefinableElement) redefinedElements
				.next();

			if (!redefinedElement.isConsistentWith(redefinableElement)) {
				result = false;

				if (null == diagnostics) {
					return result;
				} else {
					diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UML2Validator.DIAGNOSTIC_SOURCE,
								UML2Validator.REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT,
								UML2Plugin.INSTANCE
									.getString(
										"_UI_RedefinableElement_RedefinitionConsistent_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											redefinableElement,
											redefinedElement)),
								new Object[] {redefinableElement, redefinedElement}));
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
	 * false
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(RedefinableElement redefinableElement, RedefinableElement redefinee) {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * self.redefinitionContext->exists(c | redefinable.redefinitionContext->exists(r | c.allParents()->includes(r)))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isRedefinitionContextValid(RedefinableElement redefinableElement, RedefinableElement redefinable) {

		for (Iterator redefinitionContexts = redefinableElement
			.getRedefinitionContexts().iterator(); redefinitionContexts
			.hasNext();) {

			Classifier redefinitionContext = (Classifier) redefinitionContexts
				.next();

			for (Iterator redefinableRedefinitionContexts = redefinable
				.getRedefinitionContexts().iterator(); redefinableRedefinitionContexts
				.hasNext();) {

				Classifier redefinableRedefinitionContext = (Classifier) redefinableRedefinitionContexts
					.next();

				if (redefinitionContext.allParents().contains(
					redefinableRedefinitionContext)) {

					return true;
				}
			}
		}

		return false;
	}
} // RedefinableElementOperations
