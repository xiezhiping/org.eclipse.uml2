/*
 * Copyright (c) 2015 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.common.util;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * A list that enforces subset/superset constraints. Specifically, when an
 * element is added to a subset, it is also added to the associated superset(s),
 * if not already present; when an element is removed from a superset, it is
 * also removed from the associated subset(s), if present.
 * 
 * @since 2.1
 */
public class SubsetSupersetEDataTypeEList<E>
		extends EDataTypeEList<E> {

	private static final long serialVersionUID = 1L;

	public static class Unsettable<E>
			extends SubsetSupersetEDataTypeEList<E> {

		private static final long serialVersionUID = 1L;

		protected boolean isSet;

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				subsetFeatureIDs);
		}

		@Override
		protected void didChange() {
			isSet = true;
		}

		@Override
		public boolean isSet() {
			return isSet;
		}

		@Override
		public void unset() {
			super.unset();

			if (isNotificationRequired()) {
				boolean oldIsSet = isSet;
				isSet = false;

				owner.eNotify(createNotification(Notification.UNSET, oldIsSet,
					false));
			} else {
				isSet = false;
			}
		}
	}

	/**
	 * An array of superset feature identifiers.
	 */
	protected final int[] supersetFeatureIDs;

	/**
	 * An array of subset feature identifiers.
	 */
	protected final int[] subsetFeatureIDs;

	public SubsetSupersetEDataTypeEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs,
			int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID);

		this.supersetFeatureIDs = supersetFeatureIDs;
		this.subsetFeatureIDs = subsetFeatureIDs;
	}

	/**
	 * Indicates whether subset constraints should be enforced.
	 * 
	 * @return <code>true</code> if subset constraints should be enforced;
	 *         <code>false</code> otherwise.
	 */
	protected boolean enforceSubsetConstraints() {
		Resource.Internal eInternalResource = owner.eInternalResource();
		return eInternalResource == null || !eInternalResource.isLoading();
	}

	/**
	 * Adds the specified element to the superset(s).
	 * 
	 * @param object
	 *            The element to be added.
	 */
	protected void supersetAdd(Object object) {

		if (supersetFeatureIDs != null && enforceSubsetConstraints()) {

			for (int i = 0; i < supersetFeatureIDs.length; i++) {
				EStructuralFeature supersetEStructuralFeature = owner.eClass()
					.getEStructuralFeature(supersetFeatureIDs[i]);

				if (supersetEStructuralFeature.isMany()) {
					@SuppressWarnings("unchecked")
					EList<Object> supersetEList = (EList<Object>) owner
						.eGet(supersetEStructuralFeature);

					if (!supersetEList.contains(object)) {
						supersetEList.add(object);
					}
				}
			}
		}
	}

	/**
	 * Indicates whether superset constraints should be enforced.
	 * 
	 * @return <code>true</code> if superset constraints should be enforced;
	 *         <code>false</code> otherwise.
	 */
	protected boolean enforceSupersetConstraints() {
		return true;
	}

	/**
	 * Removes the specified element from the subset(s).
	 * 
	 * @param object
	 *            The element to be removed.
	 */
	protected void subsetRemove(Object object) {

		if (subsetFeatureIDs != null && enforceSupersetConstraints()) {

			for (int i = 0; i < subsetFeatureIDs.length; i++) {
				EStructuralFeature subsetEStructuralFeature = owner.eClass()
					.getEStructuralFeature(subsetFeatureIDs[i]);

				if (subsetEStructuralFeature.isMany()) {
					@SuppressWarnings("unchecked")
					EList<Object> list = ((EList<Object>) owner
						.eGet(subsetEStructuralFeature));
					list.remove(object);
				} else if (object.equals(owner.eGet(subsetEStructuralFeature))) {
					owner.eSet(subsetEStructuralFeature, null);
				}
			}
		}
	}

	@Override
	public NotificationChain basicAdd(E object, NotificationChain notifications) {
		notifications = super.basicAdd(object, notifications);

		supersetAdd(object);

		return notifications;
	}

	@Override
	public NotificationChain basicSet(int index, E object,
			NotificationChain notifications) {
		Object oldObject = data[index];

		notifications = super.basicSet(index, object, notifications);

		supersetAdd(object);

		if (oldObject != object) {
			subsetRemove(oldObject);
		}

		return notifications;
	}

	@Override
	public void add(int index, E object) {
		super.add(index, object);

		supersetAdd(object);
	}

	@Override
	public boolean add(E object) {
		boolean result = super.add(object);

		supersetAdd(object);

		return result;
	}

	@Override
	public boolean addAll(Collection<? extends E> collection) {
		boolean result = super.addAll(collection);

		for (Iterator<? extends E> elements = collection.iterator(); elements
			.hasNext();) {

			supersetAdd(elements.next());
		}

		return result;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> collection) {
		boolean result = super.addAll(index, collection);

		for (Iterator<? extends E> elements = collection.iterator(); elements
			.hasNext();) {

			supersetAdd(elements.next());
		}

		return result;
	}

	@Override
	public E set(int index, E object) {
		E result = super.set(index, object);

		supersetAdd(object);

		if (result != object) {
			subsetRemove(result);
		}

		return result;
	}

	@Override
	protected void didRemove(int index, E oldObject) {
		super.didRemove(index, oldObject);

		subsetRemove(oldObject);
	}

}