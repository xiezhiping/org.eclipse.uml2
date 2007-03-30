/*
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SubsetSupersetEObjectEList.java,v 1.5 2007/03/30 18:17:33 khussey Exp $
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
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * @since 1.2
 */
public class SubsetSupersetEObjectEList<E>
		extends EObjectEList<E> {

	private static final long serialVersionUID = 1L;

	public static class Unsettable<E>
			extends SubsetSupersetEObjectEList<E> {

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

	protected final int[] supersetFeatureIDs;

	protected final int[] subsetFeatureIDs;

	public SubsetSupersetEObjectEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs,
			int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID);

		this.supersetFeatureIDs = supersetFeatureIDs;
		this.subsetFeatureIDs = subsetFeatureIDs;
	}

	protected boolean enforceSubsetConstraints() {
		Resource.Internal eInternalResource = owner.eInternalResource();
		return eInternalResource == null || !eInternalResource.isLoading();
	}

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

	protected boolean enforceSupersetConstraints() {
		return true;
	}

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