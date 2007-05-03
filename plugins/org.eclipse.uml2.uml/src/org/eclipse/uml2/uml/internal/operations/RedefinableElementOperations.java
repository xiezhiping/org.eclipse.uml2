/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: RedefinableElementOperations.java,v 1.10 2007/05/03 21:11:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
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
	 * @param redefinableElement The receiving '<em><b>Redefinable Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRedefinitionContextValid(
			RedefinableElement redefinableElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		for (RedefinableElement redefinedElement : redefinableElement
			.getRedefinedElements()) {

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
	 * @param redefinableElement The receiving '<em><b>Redefinable Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRedefinitionConsistent(
			RedefinableElement redefinableElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = true;

		for (RedefinableElement redefinedElement : redefinableElement
			.getRedefinedElements()) {

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
	 * @param redefinableElement The receiving '<em><b>Redefinable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isRedefinitionContextValid(
			RedefinableElement redefinableElement,
			RedefinableElement redefinable) {
		EList<Classifier> rRedefinitionContexts = redefinable
			.getRedefinitionContexts();

		for (Classifier reRedefinitionContext : redefinableElement
			.getRedefinitionContexts()) {

			EList<Classifier> reRedefinitionContextAllParents = reRedefinitionContext
				.allParents();

			for (Classifier rRedefinitionContext : rRedefinitionContexts) {

				if (reRedefinitionContextAllParents
					.contains(rRedefinitionContext)) {

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
	 * result = false
	 * @param redefinableElement The receiving '<em><b>Redefinable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isConsistentWith(
			RedefinableElement redefinableElement, RedefinableElement redefinee) {
		return false;
	}

	protected static EList<RedefinableElement> getAllRedefinedElements(
			RedefinableElement redefinableElement,
			EList<RedefinableElement> allRedefinedElements) {

		for (RedefinableElement redefinedElement : redefinableElement
			.getRedefinedElements()) {

			if (allRedefinedElements.add(redefinedElement)) {
				getAllRedefinedElements(redefinedElement, allRedefinedElements);
			}
		}

		return allRedefinedElements;
	}

	protected static EList<RedefinableElement> getAllRedefinedElements(
			RedefinableElement redefinableElement) {
		return getAllRedefinedElements(redefinableElement,
			new UniqueEList.FastCompare<RedefinableElement>());
	}

	protected static <E extends Element> EList<E> excludeRedefinedElements(
			EList<E> redefineableElements) {
		EList<RedefinableElement> allRedefinedElements = new UniqueEList.FastCompare<RedefinableElement>();

		for (Element redefinableElement : redefineableElements) {

			if (redefinableElement instanceof RedefinableElement) {
				getAllRedefinedElements(
					(RedefinableElement) redefinableElement,
					allRedefinedElements);
			}
		}

		for (Iterator<?> re = redefineableElements.iterator(); re.hasNext();) {

			if (allRedefinedElements.contains(re.next())) {
				re.remove();
			}
		}

		return redefineableElements;
	}

} // RedefinableElementOperations
