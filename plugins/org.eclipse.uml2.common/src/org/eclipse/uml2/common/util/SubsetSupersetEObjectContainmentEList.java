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
 * $Id: SubsetSupersetEObjectContainmentEList.java,v 1.2 2006/10/18 18:46:45 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * @since 1.2
 */
public class SubsetSupersetEObjectContainmentEList
		extends SubsetSupersetEObjectEList {

	public static class Unsettable
			extends SubsetSupersetEObjectContainmentEList {

		public static class Resolving
				extends Unsettable {

			public Resolving(Class dataClass, InternalEObject owner,
					int featureID, int[] supersetFeatureIDs,
					int[] subsetFeatureIDs) {
				super(dataClass, owner, featureID, supersetFeatureIDs,
					subsetFeatureIDs);
			}

			protected boolean hasProxies() {
				return true;
			}

			protected Object resolve(int index, Object object) {
				return resolve(index, (EObject) object);
			}
		}

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

	public static class Resolving
			extends SubsetSupersetEObjectContainmentEList {

		public Resolving(Class dataClass, InternalEObject owner, int featureID,
				int[] supersetFeatureIDs, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				subsetFeatureIDs);
		}

		protected boolean hasProxies() {
			return true;
		}

		protected Object resolve(int index, Object object) {
			return resolve(index, (EObject) object);
		}
	}

	public SubsetSupersetEObjectContainmentEList(Class dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs,
			int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID, supersetFeatureIDs, subsetFeatureIDs);
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

	public boolean addAll(Collection collection) {
		return super.addAll(new ArrayList(collection));
	}

	public boolean addAll(int index, Collection collection) {
		return super.addAll(index, new ArrayList(collection));
	}

}