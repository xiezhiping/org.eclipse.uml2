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
 * $Id: ElementOperations.java,v 1.11 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.UML2Plugin;
import org.eclipse.uml2.util.UML2Validator;

/**
 * A static utility class that provides operations related to elements.
 */
public final class ElementOperations
		extends UML2Operations {

	/**
	 * The source for the keywords annotation on elements.
	 */
	public static final String ANNOTATION_SOURCE__KEYWORDS = "keywords"; //$NON-NLS-1$

	/**
	 * Constructs a new Element Operations. This constructor should never be
	 * called because this is a static utility class.
	 */
	private ElementOperations() {
		super();
	}

	public static Set allOwnedElements(Element element) {
		Set allOwnedElements = new HashSet();
		allOwnedElements.addAll(element.getOwnedElements());

		for (Iterator ownedElements = element.getOwnedElements().iterator(); ownedElements
			.hasNext();) {

			allOwnedElements.addAll(((Element) ownedElements.next())
				.allOwnedElements());
		}

		return allOwnedElements;
	}

	public static boolean mustBeOwned(Element element) {
		return true;
	}

	/**
	 * Retrieves the model that contains (either directly or indirectly) the
	 * specified element.
	 * 
	 * @param element
	 *            The element for which to retrieve the model.
	 * @return The model containing the element, or <code>null</code>.
	 */
	public static Model getModel(Element element) {

		if (null == element) {
			return null;
		}

		return Model.class.isInstance(element)
			? (Model) element
			: (Element.class.isInstance(element.eContainer())
				? getModel((Element) element.eContainer())
				: null);
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

		if (null == element) {
			return null;
		}

		return org.eclipse.uml2.Package.class.isInstance(element)
			? (org.eclipse.uml2.Package) element
			: (Element.class.isInstance(element.eContainer())
				? getNearestPackage((Element) element.eContainer())
				: null);
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

		Resource resource = element.eResource();

		if (null != resource) {
			ResourceSet resourceSet = resource.getResourceSet();

			FilteredUsageCrossReferencer.Filter filter = new FilteredUsageCrossReferencer.Filter() {

				public boolean accept(EStructuralFeature eStructuralFeature) {
					return eStructuralFeature.isChangeable();
				}
			};

			TreeIterator eAllContents = new AbstractTreeIterator(element, true) {

				public Iterator getChildren(Object parent) {
					return new ArrayList(((EObject) parent).eContents())
						.iterator();
				}
			};

			while (eAllContents.hasNext()) {
				EObject eObject = (EObject) eAllContents.next();

				Iterator settings = null == resourceSet
					? FilteredUsageCrossReferencer.find(eObject, resource,
						filter).iterator()
					: FilteredUsageCrossReferencer.find(eObject, resourceSet,
						filter).iterator();

				while (settings.hasNext()) {
					EcoreUtil.remove((EStructuralFeature.Setting) settings
						.next(), eObject);
				}
			}

		}

		EcoreUtil.remove(element);
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

	/**
	 * An element may not directly or indirectly own itself.
	 * 
	 */
	public static boolean validateNotOwnSelf(Element element,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (element.allOwnedElements().contains(element)) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UML2Validator.DIAGNOSTIC_SOURCE,
					UML2Validator.ELEMENT__NOT_OWN_SELF, UML2Plugin.INSTANCE
						.getString("_UI_Element_NotOwnSelf_diagnostic", //$NON-NLS-1$
							getMessageSubstitutions(context, element)),
					new Object[]{element}));
			}
		}

		return result;
	}

	/**
	 * Elements that must be owned must have an owner.
	 * 
	 */
	public static boolean validateHasOwner(Element element,
			DiagnosticChain diagnostics, Map context) {
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

}