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
 * $Id: SupersetEObjectWithInverseResolvingEList.java,v 1.2 2004/04/10 04:09:51 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 *  
 */
public class SupersetEObjectWithInverseResolvingEList
	extends SupersetEObjectWithInverseEList {

	public static class Unsettable
		extends SupersetEObjectWithInverseResolvingEList {

		public static class ManyInverse
			extends Unsettable {

			public ManyInverse(Class dataClass, InternalEObject owner,
					int featureID, int[] subsetFeatureIDs, int inverseFeatureID) {
				super(dataClass, owner, featureID, subsetFeatureIDs,
					inverseFeatureID);
			}

			public ManyInverse(Class dataClass, InternalEObject owner,
					int featureID, int subsetFeatureID, int inverseFeatureID) {
				this(dataClass, owner, featureID, new int[] {subsetFeatureID},
					inverseFeatureID);
			}

			protected boolean hasManyInverse() {
				return true;
			}
		}

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

	public static class ManyInverse
		extends SupersetEObjectWithInverseResolvingEList {

		public ManyInverse(Class dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, subsetFeatureIDs,
				inverseFeatureID);
		}

		public ManyInverse(Class dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[] {subsetFeatureID},
				inverseFeatureID);
		}

		protected boolean hasManyInverse() {
			return true;
		}
	}

	public SupersetEObjectWithInverseResolvingEList(Class dataClass,
			InternalEObject owner, int featureID, int[] subsetFeatureIDs,
			int inverseFeatureID) {
		super(dataClass, owner, featureID, subsetFeatureIDs, inverseFeatureID);
	}

	public SupersetEObjectWithInverseResolvingEList(Class dataClass,
			InternalEObject owner, int featureID, int subsetFeatureID,
			int inverseFeatureID) {
		this(dataClass, owner, featureID, new int[] {subsetFeatureID},
			inverseFeatureID);
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