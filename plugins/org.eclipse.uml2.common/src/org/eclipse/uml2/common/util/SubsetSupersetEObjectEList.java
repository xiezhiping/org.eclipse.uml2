/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SubsetSupersetEObjectEList.java,v 1.3 2006/10/18 18:46:45 khussey Exp $
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
public class SubsetSupersetEObjectEList
		extends EObjectEList {

	public static class Unsettable
			extends SubsetSupersetEObjectEList {

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				subsetFeatureIDs);
		}

		protected void didChange() {
			isSet = true;
		}

		public boolean isSet() {
			return isSet;
		}

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

	public SubsetSupersetEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int[] supersetFeatureIDs, int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID);

		this.supersetFeatureIDs = supersetFeatureIDs;
		this.subsetFeatureIDs = subsetFeatureIDs;
	}

	protected void supersetAdd(Object object) {

		if (supersetFeatureIDs != null) {
			Resource.Internal eInternalResource = owner.eInternalResource();

			if (eInternalResource != null && eInternalResource.isLoading()) {
				return;
			}

			for (int i = 0; i < supersetFeatureIDs.length; i++) {
				EStructuralFeature supersetEStructuralFeature = owner.eClass()
					.getEStructuralFeature(supersetFeatureIDs[i]);

				if (supersetEStructuralFeature.isMany()) {
					EList supersetEList = (EList) owner
						.eGet(supersetEStructuralFeature);

					if (!supersetEList.contains(object)) {
						supersetEList.add(object);
					}
				}
			}

		}
	}

	protected void subsetRemove(Object object) {

		if (subsetFeatureIDs != null) {

			for (int i = 0; i < subsetFeatureIDs.length; i++) {
				EStructuralFeature subsetEStructuralFeature = owner.eClass()
					.getEStructuralFeature(subsetFeatureIDs[i]);

				if (subsetEStructuralFeature.isMany()) {
					((EList) owner.eGet(subsetEStructuralFeature))
						.remove(object);
				} else if (object.equals(owner.eGet(subsetEStructuralFeature))) {
					owner.eSet(subsetEStructuralFeature, null);
				}
			}

		}
	}

	public NotificationChain basicAdd(Object object,
			NotificationChain notifications) {
		notifications = super.basicAdd(object, notifications);

		supersetAdd(object);

		return notifications;
	}

	public NotificationChain basicSet(int index, Object object,
			NotificationChain notifications) {
		Object oldObject = data[index];

		notifications = super.basicSet(index, object, notifications);

		supersetAdd(object);

		if (oldObject != object) {
			subsetRemove(oldObject);
		}

		return notifications;
	}

	public void add(int index, Object object) {
		super.add(index, object);

		supersetAdd(object);
	}

	public boolean add(Object object) {
		boolean result = super.add(object);

		supersetAdd(object);

		return result;
	}

	public boolean addAll(Collection collection) {
		boolean result = super.addAll(collection);

		for (Iterator elements = collection.iterator(); elements.hasNext();) {
			supersetAdd(elements.next());
		}

		return result;
	}

	public boolean addAll(int index, Collection collection) {
		boolean result = super.addAll(index, collection);

		for (Iterator elements = collection.iterator(); elements.hasNext();) {
			supersetAdd(elements.next());
		}

		return result;
	}

	public Object set(int index, Object object) {
		Object result = super.set(index, object);

		supersetAdd(object);

		if (result != object) {
			subsetRemove(result);
		}

		return result;
	}

	protected void didRemove(int index, Object oldObject) {
		super.didRemove(index, oldObject);

		subsetRemove(oldObject);
	}

}