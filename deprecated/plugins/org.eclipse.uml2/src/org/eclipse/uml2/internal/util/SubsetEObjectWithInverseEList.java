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
public class SubsetEObjectWithInverseEList
	extends SubsetEObjectEList {

	public static class Unsettable
		extends SubsetEObjectWithInverseEList {

		public static class ManyInverse
			extends Unsettable {

			public ManyInverse(Class dataClass, InternalEObject owner,
					int featureID, int[] supersetFeatureIDs,
					int inverseFeatureID) {
				super(dataClass, owner, featureID, supersetFeatureIDs,
					inverseFeatureID);
			}

			public ManyInverse(Class dataClass, InternalEObject owner,
					int featureID, int supersetFeatureID, int inverseFeatureID) {
				this(dataClass, owner, featureID,
					new int[] {supersetFeatureID}, inverseFeatureID);
			}

			protected boolean hasManyInverse() {
				return true;
			}
		}

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				inverseFeatureID);
		}

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int supersetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[] {supersetFeatureID},
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

	public static class ManyInverse
		extends SubsetEObjectWithInverseEList {

		public ManyInverse(Class dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				inverseFeatureID);
		}

		public ManyInverse(Class dataClass, InternalEObject owner,
				int featureID, int supersetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[] {supersetFeatureID},
				inverseFeatureID);
		}

		protected boolean hasManyInverse() {
			return true;
		}
	}

	protected final int inverseFeatureID;

	public SubsetEObjectWithInverseEList(Class dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs,
			int inverseFeatureID) {
		super(dataClass, owner, featureID, supersetFeatureIDs);

		this.inverseFeatureID = inverseFeatureID;
	}

	public SubsetEObjectWithInverseEList(Class dataClass,
			InternalEObject owner, int featureID, int supersetFeatureID,
			int inverseFeatureID) {
		this(dataClass, owner, featureID, new int[] {supersetFeatureID},
			inverseFeatureID);
	}

	protected boolean hasInverse() {
		return true;
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