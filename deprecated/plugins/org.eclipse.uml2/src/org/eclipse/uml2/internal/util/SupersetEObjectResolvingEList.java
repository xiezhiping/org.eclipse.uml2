/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.internal.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 *
 */
public class SupersetEObjectResolvingEList
	extends SupersetEObjectEList {

	public static class Unsettable
		extends SupersetEObjectResolvingEList {

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, subsetFeatureIDs);
		}

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID) {
			this(dataClass, owner, featureID, new int[] {subsetFeatureID});
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

	public SupersetEObjectResolvingEList(Class dataClass,
			InternalEObject owner, int featureID, int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID, subsetFeatureIDs);
	}

	public SupersetEObjectResolvingEList(Class dataClass,
			InternalEObject owner, int featureID, int subsetFeatureID) {
		this(dataClass, owner, featureID, new int[] {subsetFeatureID});
	}

	protected boolean hasProxies() {
		return true;
	}

	protected Object resolve(Object object) {
		return object instanceof EObject && ((EObject) object).eIsProxy()
			? resolveProxy((EObject) object) : object;
	}

	/**
	 * @see org.eclipse.uml2.internal.util.SupersetEObjectEList#subsetRemove(java.lang.Object)
	 */
	protected void subsetRemove(Object object) {
		super.subsetRemove(resolve(object));
	}

}