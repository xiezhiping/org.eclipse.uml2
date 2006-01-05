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
 * $Id: SubsetSupersetEObjectWithInverseResolvingEList.java,v 1.1 2006/01/05 13:49:53 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

public class SubsetSupersetEObjectWithInverseResolvingEList
		extends SubsetSupersetEObjectWithInverseEList {

	public static class Unsettable
			extends SubsetSupersetEObjectWithInverseResolvingEList {

		public static class ManyInverse
				extends Unsettable {

			public ManyInverse(Class dataClass, InternalEObject owner,
					int featureID, int[] supersetFeatureIDs,
					int[] subsetFeatureIDs, int inverseFeatureID) {
				super(dataClass, owner, featureID, supersetFeatureIDs,
					subsetFeatureIDs, inverseFeatureID);
			}

			protected boolean hasManyInverse() {
				return true;
			}
		}

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs,
				int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				subsetFeatureIDs, inverseFeatureID);
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
			extends SubsetSupersetEObjectWithInverseResolvingEList {

		public ManyInverse(Class dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs,
				int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				subsetFeatureIDs, inverseFeatureID);
		}

		protected boolean hasManyInverse() {
			return true;
		}
	}

	public SubsetSupersetEObjectWithInverseResolvingEList(Class dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs,
			int[] subsetFeatureIDs, int inverseFeatureID) {
		super(dataClass, owner, featureID, supersetFeatureIDs,
			subsetFeatureIDs, inverseFeatureID);
	}

	protected boolean hasProxies() {
		return true;
	}

	protected Object resolve(int index, Object object) {
		return resolve(index, (EObject) object);
	}

}