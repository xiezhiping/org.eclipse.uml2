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
 * $Id: ElementOperations.java,v 1.4 2004/04/27 16:38:54 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.ECrossReferenceEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Model;
import org.eclipse.uml2.UML2DiagnosticConstants;
import org.eclipse.uml2.UML2Plugin;

/**
 * A static utility class that provides operations related to elements.
 */
public final class ElementOperations
	extends UML2Operations {

	protected static class ChangeableECrossReferenceEList
		extends ECrossReferenceEList {

		protected static class ChangeableFeatureIteratorImpl
			extends ECrossReferenceEList.FeatureIteratorImpl {

			public ChangeableFeatureIteratorImpl(EObject eObject) {
				super(eObject);
			}

			public ChangeableFeatureIteratorImpl(EObject eObject,
					EStructuralFeature[] eStructuralFeatures) {
				super(eObject, eStructuralFeatures);
			}

			protected boolean isIncluded(EStructuralFeature eStructuralFeature) {
				return super.isIncluded(eStructuralFeature)
					&& eStructuralFeature.isChangeable();
			}

			protected boolean isIncludedEntry(
					EStructuralFeature eStructuralFeature) {
				return super.isIncludedEntry(eStructuralFeature)
					&& eStructuralFeature.isChangeable();
			}
		}

		protected static class ChangeableResolvingFeatureIteratorImpl
			extends ChangeableFeatureIteratorImpl {

			public ChangeableResolvingFeatureIteratorImpl(EObject eObject) {
				super(eObject);
			}

			public ChangeableResolvingFeatureIteratorImpl(EObject eObject,
					EStructuralFeature[] eStructuralFeatures) {
				super(eObject, eStructuralFeatures);
			}

			protected boolean resolve() {
				return true;
			}
		}

		protected ChangeableECrossReferenceEList(EObject eObject) {
			super(eObject);
		}

		protected ChangeableECrossReferenceEList(EObject eObject,
				EStructuralFeature[] eStructuralFeatures) {
			super(eObject, eStructuralFeatures);
		}

		protected boolean isIncluded(EStructuralFeature eStructuralFeature) {
			return super.isIncluded(eStructuralFeature)
				&& eStructuralFeature.isChangeable();
		}

		protected ListIterator newListIterator() {
			return this.resolve()
				? new ChangeableResolvingFeatureIteratorImpl(eObject,
						eStructuralFeatures)
				: new ChangeableFeatureIteratorImpl(eObject,
						eStructuralFeatures);
		}

		public List basicList() {
			return new ChangeableECrossReferenceEList(eObject,
				eStructuralFeatures) {

				protected boolean resolve() {
					return false;
				}
			};
		}

		public Iterator basicIterator() {

			if (eStructuralFeatures == null) {
				return ChangeableFeatureIteratorImpl.EMPTY_ITERATOR;
			}

			return new ChangeableFeatureIteratorImpl(eObject,
					eStructuralFeatures);
		}

		public ListIterator basicListIterator() {

			if (eStructuralFeatures == null) {
				return FeatureIteratorImpl.EMPTY_ITERATOR;
			}

			return new ChangeableFeatureIteratorImpl(eObject,
					eStructuralFeatures);
		}

		public ListIterator basicListIterator(int index) {

			if (eStructuralFeatures == null) {

				if (index < 0 || index > 1) {
					throw new IndexOutOfBoundsException("index = " + index //$NON-NLS-1$
						+ ", size = 0"); //$NON-NLS-1$
				}

				return ChangeableFeatureIteratorImpl.EMPTY_ITERATOR;
			}

			ListIterator result = new ChangeableFeatureIteratorImpl(eObject,
					eStructuralFeatures);

			for (int i = 0; i < index; ++i) {
				result.next();
			}

			return result;
		}

	}

	public static class ChangeableUsageCrossReferencer
		extends EcoreUtil.UsageCrossReferencer {

		public static Collection find(EObject eObject, ResourceSet resourceSet) {
			return new ChangeableUsageCrossReferencer(resourceSet)
				.findUsage(eObject);
		}

		protected ChangeableUsageCrossReferencer(ResourceSet resourceSet) {
			super(resourceSet);
		}

		protected void handleCrossReference(EObject eObject) {
			InternalEList eCrossReferences = new ChangeableECrossReferenceEList(
					eObject);

			EContentsEList.FeatureIterator crossReferences = (EContentsEList.FeatureIterator) (resolve()
				? eCrossReferences.iterator() : eCrossReferences
					.basicIterator());

			while (crossReferences.hasNext()) {
				EObject crossReferencedEObject = (EObject) crossReferences
					.next();
				EReference eReference = (EReference) crossReferences.feature();

				if (crossReference(eObject, eReference, crossReferencedEObject)) {
					getCollection(crossReferencedEObject).add(
						((InternalEObject) eObject).eSetting(eReference));
				}
			}
		}

	}

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
			? (Model) element : (Element.class.isInstance(element.eContainer())
				? getModel((Element) element.eContainer()) : null);
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
			? (org.eclipse.uml2.Package) element : (Element.class
				.isInstance(element.eContainer())
				? getNearestPackage((Element) element.eContainer()) : null);
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

		ResourceSet resourceSet = null == element.eResource()
			? null : element.eResource().getResourceSet();

		if (null != resourceSet) {
			TreeIterator eAllContents = new AbstractTreeIterator(element, true) {

				public Iterator getChildren(Object parent) {
					return ((EObject) parent).eContents().iterator();
				}
			};

			while (eAllContents.hasNext()) {
				EObject eObject = (EObject) eAllContents.next();

				for (Iterator settings = ChangeableUsageCrossReferencer.find(
					eObject, resourceSet).iterator(); settings.hasNext();) {

					EcoreUtil.remove((EStructuralFeature.Setting) settings
						.next(), eObject);
				}
			}
		}

		EcoreUtil.remove(element);
	}

	public static boolean validateNotOwnSelf(Element element,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (element.allOwnedElements().contains(element)) {
			result = false;

			if (null != diagnostics) {
				diagnostics
					.add(new BasicDiagnostic(Diagnostic.WARNING,
							UML2DiagnosticConstants.PLUGIN_ID,
							UML2DiagnosticConstants.ELEMENT__NOT_OWN_SELF,
							UML2Plugin.INSTANCE
								.getString("_UI_Element_NotOwnSelf_message"), //$NON-NLS-1$
							null));
			}
		}

		return result;
	}

	public static boolean validateHasOwner(Element element,
			DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (element.mustBeOwned() && null == element.getOwner()) {
			result = false;

			if (null != diagnostics) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
						UML2DiagnosticConstants.PLUGIN_ID,
						UML2DiagnosticConstants.ELEMENT__HAS_OWNER,
						UML2Plugin.INSTANCE
							.getString("_UI_Element_HasOwner_message"), null)); //$NON-NLS-1$
			}
		}

		return result;
	}

}