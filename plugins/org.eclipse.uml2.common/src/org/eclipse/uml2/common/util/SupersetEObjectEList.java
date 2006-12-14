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
 * $Id: SupersetEObjectEList.java,v 1.3 2006/12/14 15:47:32 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

@Deprecated
public class SupersetEObjectEList<E>
		extends EObjectEList<E> {

	private static final long serialVersionUID = 1L;

	public static class Unsettable<E>
			extends SupersetEObjectEList<E> {

		private static final long serialVersionUID = 1L;

		protected boolean isSet;

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, subsetFeatureIDs);
		}

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID});
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

	protected final int[] subsetFeatureIDs;

	public SupersetEObjectEList(Class<?> dataClass, InternalEObject owner,
			int featureID, int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID);

		this.subsetFeatureIDs = subsetFeatureIDs;
	}

	public SupersetEObjectEList(Class<?> dataClass, InternalEObject owner,
			int featureID, int subsetFeatureID) {
		this(dataClass, owner, featureID, new int[]{subsetFeatureID});
	}

	protected void subsetRemove(Object object) {

		if (subsetFeatureIDs != null) {

			for (int i = 0; i < subsetFeatureIDs.length; i++) {
				EStructuralFeature subsetEStructuralFeature = owner.eClass()
					.getEStructuralFeature(subsetFeatureIDs[i]);

				if (subsetEStructuralFeature.isMany()) {
					((EList<?>) owner.eGet(subsetEStructuralFeature))
						.remove(object);
				} else if (object.equals(owner.eGet(subsetEStructuralFeature))) {
					owner.eSet(subsetEStructuralFeature, null);
				}
			}
		}
	}

	@Override
	protected void didRemove(int index, E oldObject) {
		super.didRemove(index, oldObject);

		subsetRemove(oldObject);
	}

	@Override
	public NotificationChain basicSet(int index, E object,
			NotificationChain notifications) {
		Object oldObject = data[index];

		notifications = super.basicSet(index, object, notifications);

		if (oldObject != object) {
			subsetRemove(oldObject);
		}

		return notifications;
	}

	@Override
	public E set(int index, E object) {
		E result = super.set(index, object);

		if (result != object) {
			subsetRemove(result);
		}

		return result;
	}

}