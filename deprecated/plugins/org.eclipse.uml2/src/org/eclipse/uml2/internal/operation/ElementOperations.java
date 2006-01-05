/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ElementOperations.java,v 1.17 2006/01/05 22:42:56 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.Element;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.UML2Plugin;

import org.eclipse.uml2.util.UML2Validator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.Element#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.Element#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public class ElementOperations extends UML2Operations {

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
	protected ElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * An element may not directly or indirectly own itself.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * not self.allOwnedElements()->includes(self)
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateNotOwnSelf(Element element, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (element.allOwnedElements().contains(element)) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.ELEMENT__NOT_OWN_SELF,
					UML2Plugin.INSTANCE.getString(
						"_UI_Element_NotOwnSelf_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, element)),
					new Object[]{element}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Elements that must be owned must have an owner.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.mustBeOwned() implies owner->notEmpty()
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateHasOwner(Element element, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (element.mustBeOwned() && null == element.getOwner()) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.ELEMENT__HAS_OWNER, UML2Plugin.INSTANCE
						.getString("_UI_Element_HasOwner_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, element)),
					new Object[]{element}));
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
	 * ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static Set allOwnedElements(Element element) {
		EList ownedElements = element.getOwnedElements();
		Set allOwnedElements = new HashSet(ownedElements);

		for (Iterator i = ownedElements.iterator(); i.hasNext();) {
			allOwnedElements.addAll(((Element) i.next()).allOwnedElements());
		}

		return Collections.unmodifiableSet(allOwnedElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * true
	 * </code>
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean mustBeOwned(Element element) {
		return true;
	}

	// <!-- begin-custom-operations -->

	/**
	 * The source for the keywords annotation on elements.
	 */
	public static final String ANNOTATION_SOURCE__KEYWORDS = "keywords"; //$NON-NLS-1$

	/**
	 * Retrieves the model that contains (either directly or indirectly) the
	 * specified element.
	 * 
	 * @param element
	 *            The element for which to retrieve the model.
	 * @return The model containing the element, or <code>null</code>.
	 */
	public static Model getModel(Element element) {

		if (null == element || Model.class.isInstance(element)) {
			return (Model) element;
		}

		EObject eContainer = element.eContainer();
		return Element.class.isInstance(eContainer)
			? getModel((Element) eContainer)
			: null;
	}

	/**
	 * Retrieves the nearest package that contains (either directly or
	 * indirectly) the specified element, or the element itself (if it is a
	 * package).
	 * 
	 * @param element
	 *            The element for which to retrieve the nearest package.
	 * @return The nearest package containing the element, the element itself,
	 *         or <code>null</code>.
	 */
	public static org.eclipse.uml2.Package getNearestPackage(Element element) {

		if (null == element
			|| org.eclipse.uml2.Package.class.isInstance(element)) {

			return (org.eclipse.uml2.Package) element;
		}

		EObject eContainer = element.eContainer();
		return Element.class.isInstance(eContainer)
			? getNearestPackage((Element) eContainer)
			: null;
	}

	/**
	 * Destroys the specified element by removing all usage cross references to
	 * it (from within its resource set) and removing it from its containing
	 * resource or object.
	 * <p>
	 * Note that this operation can be expensive (since it traverses all
	 * containment hierarchies) and doesn't guarantee that all references will
	 * be removed (since references can exist in other resources that don't
	 * belong to the same resource set).
	 * 
	 * @param element
	 *            The element to be destroyed.
	 */
	public static void destroy(Element element) {
		
		if (null == element) {
			throw new IllegalArgumentException(String.valueOf(element));
		}

		destroy((EObject) element);
	}

	/**
	 * Retrieves the set of keywords for the specified element.
	 * 
	 * @param element
	 *            The element for which to retrieve keywords.
	 * @return The keywords for the specified element.
	 */
	public static Set getKeywords(Element element) {

		if (null == element) {
			return Collections.EMPTY_SET;
		}

		return Collections.unmodifiableSet(safeGetEAnnotation(element,
			ANNOTATION_SOURCE__KEYWORDS).getDetails().keySet());
	}

	/**
	 * Determines whether the specified element has the specified keyword.
	 * 
	 * @param element
	 *            The element in question.
	 * @param keyword
	 *            The keyword in question.
	 * @return <code>true</code> if the specified element has the specified
	 *         keyword; <code>false</code> otherwise.
	 */
	public static boolean hasKeyword(Element element, String keyword) {

		if (null == element) {
			return false;
		}

		if (isEmpty(keyword)) {
			return false;
		}

		return safeGetEAnnotation(element, ANNOTATION_SOURCE__KEYWORDS)
			.getDetails().containsKey(keyword);
	}

	/**
	 * Adds the specified keyword to the specified element.
	 * 
	 * @param element
	 *            The element to which to add the keyword.
	 * @param keyword
	 *            The keyword to be added.
	 * @throws IllegalArgumentException
	 *             If the keyword is invalid (i.e. empty).
	 */
	public static void addKeyword(Element element, String keyword) {

		if (null == element) {
			throw new IllegalArgumentException(String.valueOf(element));
		}

		if (isEmpty(keyword)) {
			throw new IllegalArgumentException(String.valueOf(keyword));
		}

		getEAnnotation(element, ANNOTATION_SOURCE__KEYWORDS, true).getDetails()
			.put(keyword, null);
	}

	/**
	 * Removes the specified keyword from the specified element.
	 * 
	 * @param element
	 *            The element from which to remove the keyword.
	 * @param keyword
	 *            The keyword to be removed.
	 * @throws IllegalArgumentException
	 *             If the element does not have the keyword.
	 */
	public static void removeKeyword(Element element, String keyword) {

		if (null == element) {
			throw new IllegalArgumentException(String.valueOf(element));
		}

		if (!hasKeyword(element, keyword)) {
			throw new IllegalArgumentException(String.valueOf(keyword));
		}

		safeGetEAnnotation(element, ANNOTATION_SOURCE__KEYWORDS).getDetails()
			.removeKey(keyword);
	}

	// <!-- end-custom-operations -->

} // ElementOperations