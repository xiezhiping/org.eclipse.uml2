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
 * $Id: SupersetEObjectEList.java,v 1.2 2006/01/05 13:49:53 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * @deprecated Use SubsetSupersetEObjectEList
 */
public class SupersetEObjectEList
		extends EObjectEList {

	public static class Unsettable
			extends SupersetEObjectEList {

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, subsetFeatureIDs);
		}

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID});
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.common.util.BasicEList#didChange()
		 */
		protected void didChange() {
			isSet = true;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.common.notify.impl.NotifyingListImpl#isSet()
		 */
		public boolean isSet() {
			return isSet;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.EStructuralFeature.Setting#unset()
		 */
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

	public SupersetEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID);

		this.subsetFeatureIDs = subsetFeatureIDs;
	}

	public SupersetEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int subsetFeatureID) {
		this(dataClass, owner, featureID, new int[]{subsetFeatureID});
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.BasicEList#didRemove(int,
	 *      java.lang.Object)
	 */
	protected void didRemove(int index, Object oldObject) {
		super.didRemove(index, oldObject);

		subsetRemove(oldObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.NotifyingListImpl#basicSet(int,
	 *      java.lang.Object, org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain basicSet(int index, Object object,
			NotificationChain notifications) {
		Object oldObject = data[index];

		notifications = super.basicSet(index, object, notifications);

		if (oldObject != object) {
			subsetRemove(oldObject);
		}

		return notifications;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.List#set(int, java.lang.Object)
	 */
	public Object set(int index, Object object) {
		Object result = super.set(index, object);

		if (result != object) {
			subsetRemove(result);
		}

		return result;
	}

}