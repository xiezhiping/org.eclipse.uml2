/*
 * Created on Jun 18, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.uml2.edit.internal.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAttribute;
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

/**
 *  
 */
class UML2ItemPropertyDescriptor
	extends ItemPropertyDescriptor {

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature) {
		super(adapterFactory, displayName, description, feature);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable) {
		super(adapterFactory, displayName, description, feature, isSettable);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage) {
		super(adapterFactory, displayName, description, feature, isSettable,
			staticImage);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable, staticImage);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, String category) {
		super(adapterFactory, displayName, description, feature, isSettable,
			category);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			String category) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable, category);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category) {
		super(adapterFactory, displayName, description, feature, isSettable,
			staticImage, category);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable, staticImage, category);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable,
			category, filterFlags);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable, category, filterFlags);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, Object staticImage, String category,
			String[] filterFlags) {
		super(adapterFactory, displayName, description, feature, isSettable,
			staticImage, category, filterFlags);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
			feature, isSettable, staticImage, category, filterFlags);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences) {
		super(adapterFactory, displayName, description, parentReferences);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences) {
		super(adapterFactory, resourceLocator, displayName, description,
			parentReferences);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable) {
		super(adapterFactory, displayName, description, parentReferences,
			isSettable);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description,
			parentReferences, isSettable);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category) {
		super(adapterFactory, displayName, description, parentReferences,
			isSettable, category);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable, String category) {
		super(adapterFactory, resourceLocator, displayName, description,
			parentReferences, isSettable, category);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category,
			String[] filterFlags) {
		super(adapterFactory, displayName, description, parentReferences,
			isSettable, category, filterFlags);
	}

	public UML2ItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EReference[] parentReferences,
			boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
			parentReferences, isSettable, category, filterFlags);
	}

	protected void collectReferenceableObjectsOfType(Collection visited,
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

	private Collection getReferenceableObjectsOfType(EObject object,
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.provider.IItemPropertyDescriptor#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object object) {

		if (EAttribute.class.isInstance(feature)) {
			Object result = ((EObject) object).eGet(feature);

			if (null == result) {
				return getDefaultValue(feature.getEType());
			} else {
				return createPropertyValueWrapper(object, result);
			}
		} else {
			return super.getPropertyValue(object);
		}
	}
}