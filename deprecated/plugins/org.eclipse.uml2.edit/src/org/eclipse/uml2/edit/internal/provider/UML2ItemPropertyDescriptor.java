/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2ItemPropertyDescriptor.java,v 1.7 2005/04/22 20:19:59 khussey Exp $
 */
package org.eclipse.uml2.edit.internal.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.uml2.provider.IItemQualifiedTextProvider;

/**
 * @deprecated Use ElementItemProvider$UML2ItemPropertyDescriptor instead.
 */
public class UML2ItemPropertyDescriptor
	extends ItemPropertyDescriptor {

	protected class UML2ItemDelegator
		extends ItemDelegator
		implements IItemQualifiedTextProvider {

		public UML2ItemDelegator(AdapterFactory adapterFactory,
				ResourceLocator resourceLocator) {
			super(adapterFactory, resourceLocator);
		}

		public String getQualifiedText(Object object) {
			if (EList.class.isInstance(object)) {
				StringBuffer text = new StringBuffer();

				for (Iterator i = ((List) object).iterator(); i.hasNext();) {
					Object child = i.next();

					if (0 != text.length()) {
						text.append(", ");
					}

					text.append(getText(child));
				}

				return text.toString();
			} else {
				IItemQualifiedTextProvider itemQualifiedTextProvider = (IItemQualifiedTextProvider) adapterFactory
					.adapt(object, IItemQualifiedTextProvider.class);

				return null != itemQualifiedTextProvider
					? itemQualifiedTextProvider.getQualifiedText(object)
					: null == object
						? ""
						: object.toString();
			}
		}
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable);

		this.itemDelegator = new UML2ItemDelegator(adapterFactory,
			resourceLocator);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable, staticImage);

		this.itemDelegator = new UML2ItemDelegator(adapterFactory,
			resourceLocator);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable, category, filterFlags);

		this.itemDelegator = new UML2ItemDelegator(adapterFactory,
			resourceLocator);
	}

	public static void collectReferenceableObjectsOfType(Collection visited,
			Collection result, EObject object, EClassifier type) {

		if (visited.add(object)) {

			if (type.isInstance(object)) {
				result.add(object);
			}

			for (Iterator eAllReferences = object.eClass().getEAllReferences()
				.iterator(); eAllReferences.hasNext();) {

				EReference eReference = (EReference) eAllReferences.next();

				if (!eReference.isDerived()) {

					if (eReference.isMany()) {

						for (Iterator referencedObjects = ((List) object
							.eGet(eReference)).iterator(); referencedObjects
							.hasNext();) {

							Object referencedObject = referencedObjects.next();

							if (EObject.class.isInstance(referencedObject)) {
								collectReferenceableObjectsOfType(visited,
									result, (EObject) referencedObject, type);
							}
						}
					} else {
						Object referencedObject = object.eGet(eReference);

						if (EObject.class.isInstance(referencedObject)) {
							collectReferenceableObjectsOfType(visited, result,
								(EObject) referencedObject, type);
						}
					}
				}
			}
		}
	}

	public static Collection getReferenceableObjectsOfType(EObject object,
			EClassifier type) {
		Collection visited = new HashSet();
		Collection result = new ArrayList();

		Resource resource = object.eResource();

		if (null != resource) {
			ResourceSet resourceSet = resource.getResourceSet();

			if (null != resourceSet) {

				for (TreeIterator allContents = resourceSet.getAllContents(); allContents
					.hasNext();) {

					Object content = allContents.next();

					if (content instanceof EObject) {
						collectReferenceableObjectsOfType(visited, result,
							(EObject) content, type);
						allContents.prune();
					}
				}
			} else {

				for (Iterator contents = resource.getContents().iterator(); contents
					.hasNext();) {

					collectReferenceableObjectsOfType(visited, result,
						(EObject) contents.next(), type);
				}
			}
		} else {
			collectReferenceableObjectsOfType(visited, result, EcoreUtil
				.getRootContainer(object), type);
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getComboBoxObjects(java.lang.Object)
	 */
	protected Collection getComboBoxObjects(Object object) {

		if (EObject.class.isInstance(object)) {

			if (null != parentReferences) {
				Collection result = new UniqueEList();

				for (int i = 0; i < parentReferences.length; ++i) {
					result.addAll(getReferenceableObjectsOfType(
						(EObject) object, parentReferences[i].getEType()));
				}

				return result;
			} else if (null != feature) {

				if (EReference.class.isInstance(feature)) {
					Collection result = getReferenceableObjectsOfType(
						(EObject) object, feature.getEType());

					if (!feature.isMany() && !result.contains(null)) {
						result.add(null);
					}

					return result;
				} else if (EEnum.class.isInstance(feature.getEType())) {
					List enumerators = new ArrayList();

					for (Iterator eLiterals = ((EEnum) feature.getEType())
						.getELiterals().iterator(); eLiterals.hasNext();) {

						enumerators.add(((EEnumLiteral) eLiterals.next())
							.getInstance());
					}

					return enumerators;
				}
			}
		}

		return null;
	}

	public IItemQualifiedTextProvider getQualifiedTextProvider(Object object) {
		return (IItemQualifiedTextProvider) itemDelegator;
	}

}