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
public class SupersetEObjectContainmentWithInverseEList
	extends SupersetEObjectContainmentEList {

	public static class Unsettable
		extends SupersetEObjectContainmentWithInverseEList {

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, subsetFeatureIDs,
				inverseFeatureID);
		}

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[] {subsetFeatureID},
				inverseFeatureID);
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

	protected final int inverseFeatureID;

	public SupersetEObjectContainmentWithInverseEList(Class dataClass,
			InternalEObject owner, int featureID, int[] subsetFeatureIDs,
			int inverseFeatureID) {
		super(dataClass, owner, featureID, subsetFeatureIDs);

		this.inverseFeatureID = inverseFeatureID;
	}

	public SupersetEObjectContainmentWithInverseEList(Class dataClass,
			InternalEObject owner, int featureID, int subsetFeatureID,
			int inverseFeatureID) {
		this(dataClass, owner, featureID, new int[] {subsetFeatureID},
			inverseFeatureID);
	}

	protected boolean hasNavigableInverse() {
		return true;
	}

	public int getInverseFeatureID() {
		return inverseFeatureID;
	}

	public Class getInverseFeatureClass() {
		return dataClass;
	}

}