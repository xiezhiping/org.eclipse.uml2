/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: SupersetEObjectContainmentEList.java,v 1.2 2004/04/10 04:09:51 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;

/**
 *
 */
public class SupersetEObjectContainmentEList
	extends SupersetEObjectEList {

	public static class Unsettable
		extends SupersetEObjectContainmentEList {

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

	public SupersetEObjectContainmentEList(Class dataClass,
			InternalEObject owner, int featureID, int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID, subsetFeatureIDs);
	}

	public SupersetEObjectContainmentEList(Class dataClass,
			InternalEObject owner, int featureID, int subsetFeatureID) {
		this(dataClass, owner, featureID, new int[] {subsetFeatureID});
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