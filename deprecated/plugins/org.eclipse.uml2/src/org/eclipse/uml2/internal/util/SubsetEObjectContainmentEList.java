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
import org.eclipse.emf.ecore.InternalEObject;

/**
 *
 */
public class SubsetEObjectContainmentEList
	extends SubsetEObjectEList {

	public static class Unsettable
		extends SubsetEObjectContainmentEList {

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs) {
			super(dataClass, owner, featureID, supersetFeatureIDs);
		}

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int supersetFeatureID) {
			this(dataClass, owner, featureID, new int[] {supersetFeatureID});
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

	public SubsetEObjectContainmentEList(Class dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs) {
		super(dataClass, owner, featureID, supersetFeatureIDs);
	}

	public SubsetEObjectContainmentEList(Class dataClass,
			InternalEObject owner, int featureID, int supersetFeatureID) {
		this(dataClass, owner, featureID, new int[] {supersetFeatureID});
	}

	protected boolean hasInverse() {
		return true;
	}

	protected boolean hasNavigableInverse() {
		return false;
	}

	protected boolean isContainment() {
		return true;
	}

}