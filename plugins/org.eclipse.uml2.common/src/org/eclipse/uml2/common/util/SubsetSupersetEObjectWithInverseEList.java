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
 * $Id: SubsetSupersetEObjectWithInverseEList.java,v 1.3 2006/12/14 15:47:33 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * @since 1.2
 */
public class SubsetSupersetEObjectWithInverseEList<E>
		extends SubsetSupersetEObjectEList<E> {

	private static final long serialVersionUID = 1L;

	public static class Unsettable<E>
			extends SubsetSupersetEObjectWithInverseEList<E> {

		private static final long serialVersionUID = 1L;

		public static class ManyInverse<E>
				extends Unsettable<E> {

			private static final long serialVersionUID = 1L;

			public ManyInverse(Class<?> dataClass, InternalEObject owner,
					int featureID, int[] supersetFeatureIDs,
					int[] subsetFeatureIDs, int inverseFeatureID) {
				super(dataClass, owner, featureID, supersetFeatureIDs,
					subsetFeatureIDs, inverseFeatureID);
			}

			@Override
			protected boolean hasManyInverse() {
				return true;
			}
		}

		protected boolean isSet;

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs,
				int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				subsetFeatureIDs, inverseFeatureID);
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

	public static class ManyInverse<E>
			extends SubsetSupersetEObjectWithInverseEList<E> {

		private static final long serialVersionUID = 1L;

		public ManyInverse(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs,
				int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				subsetFeatureIDs, inverseFeatureID);
		}

		@Override
		protected boolean hasManyInverse() {
			return true;
		}
	}

	protected final int inverseFeatureID;

	public SubsetSupersetEObjectWithInverseEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs,
			int[] subsetFeatureIDs, int inverseFeatureID) {
		super(dataClass, owner, featureID, supersetFeatureIDs, subsetFeatureIDs);

		this.inverseFeatureID = inverseFeatureID;
	}

	@Override
	protected boolean hasInverse() {
		return true;
	}

	@Override
	protected boolean hasNavigableInverse() {
		return true;
	}

	@Override
	public int getInverseFeatureID() {
		return inverseFeatureID;
	}

	@Override
	public Class<?> getInverseFeatureClass() {
		return dataClass;
	}

}