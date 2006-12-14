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
 * $Id: SubsetEObjectEList.java,v 1.5 2006/12/14 15:47:33 khussey Exp $
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

@Deprecated
public class SubsetEObjectEList<E>
		extends EObjectEList<E> {

	private static final long serialVersionUID = 1L;

	public static class Unsettable<E>
			extends SubsetEObjectEList<E> {

		private static final long serialVersionUID = 1L;

		protected boolean isSet;

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs) {
			super(dataClass, owner, featureID, supersetFeatureIDs);
		}

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int supersetFeatureID) {
			this(dataClass, owner, featureID, new int[]{supersetFeatureID});
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

	public SubsetEObjectEList(Class<?> dataClass, InternalEObject owner,
			int featureID, int[] supersetFeatureIDs) {
		super(dataClass, owner, featureID);

		this.supersetFeatureIDs = supersetFeatureIDs;
	}

	public SubsetEObjectEList(Class<?> dataClass, InternalEObject owner,
			int featureID, int supersetFeatureID) {
		this(dataClass, owner, featureID, new int[]{supersetFeatureID});
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

	@Override
	public NotificationChain basicAdd(E object, NotificationChain notifications) {
		notifications = super.basicAdd(object, notifications);

		supersetAdd(object);

		return notifications;
	}

	@Override
	public NotificationChain basicSet(int index, E object,
			NotificationChain notifications) {
		notifications = super.basicSet(index, object, notifications);

		supersetAdd(object);

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

		return result;
	}

}