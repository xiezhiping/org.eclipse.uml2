/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RedefinableElementOperations.java,v 1.8 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.util.UML2Validator;
import org.eclipse.uml2.UML2Plugin;

/**
 * A static utility class that provides operations related to redefinable
 * elements.
 */
public final class RedefinableElementOperations
	extends UML2Operations {

	/**
	 * Constructs a new Redefinable Element Operations. This constructor should
	 * never be called because this is a static utility class.
	 */
	private RedefinableElementOperations() {
		super();
	}

	public static boolean isConsistentWith(
			RedefinableElement redefinableElement, RedefinableElement redefinee) {
		return false;
	}

	public static boolean isRedefinitionContextValid(
			RedefinableElement redefinableElement,
			RedefinableElement redefinable) {

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

	/**
	 * A redefining element must be consistent with each redefined element.
	 *  
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
	 * At least one of the redefinition contexts of the redefining element must
	 * be a specialization of at least one of the redefinition contexts for each
	 * redefined element.
	 *  
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

}