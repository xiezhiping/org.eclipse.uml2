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
 * $Id: SubsetEObjectWithInverseResolvingEList.java,v 1.3 2006/12/14 15:47:32 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

@Deprecated
public class SubsetEObjectWithInverseResolvingEList<E>
		extends SubsetEObjectWithInverseEList<E> {

	private static final long serialVersionUID = 1L;

	public static class Unsettable<E>
			extends SubsetEObjectWithInverseResolvingEList<E> {

		private static final long serialVersionUID = 1L;

		public static class ManyInverse<E>
				extends Unsettable<E> {

			private static final long serialVersionUID = 1L;

			public ManyInverse(Class<?> dataClass, InternalEObject owner,
					int featureID, int[] supersetFeatureIDs,
					int inverseFeatureID) {
				super(dataClass, owner, featureID, supersetFeatureIDs,
					inverseFeatureID);
			}

			public ManyInverse(Class<?> dataClass, InternalEObject owner,
					int featureID, int supersetFeatureID, int inverseFeatureID) {
				this(dataClass, owner, featureID, new int[]{supersetFeatureID},
					inverseFeatureID);
			}

			@Override
			protected boolean hasManyInverse() {
				return true;
			}
		}

		protected boolean isSet;

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				inverseFeatureID);
		}

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int supersetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[]{supersetFeatureID},
				inverseFeatureID);
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
			extends SubsetEObjectWithInverseResolvingEList<E> {

		private static final long serialVersionUID = 1L;

		public ManyInverse(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				inverseFeatureID);
		}

		public ManyInverse(Class<?> dataClass, InternalEObject owner,
				int featureID, int supersetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[]{supersetFeatureID},
				inverseFeatureID);
		}

		@Override
		protected boolean hasManyInverse() {
			return true;
		}
	}

	public SubsetEObjectWithInverseResolvingEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs,
			int inverseFeatureID) {
		super(dataClass, owner, featureID, supersetFeatureIDs, inverseFeatureID);
	}

	public SubsetEObjectWithInverseResolvingEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int supersetFeatureID,
			int inverseFeatureID) {
		this(dataClass, owner, featureID, new int[]{supersetFeatureID},
			inverseFeatureID);
	}

	@Override
	protected boolean hasProxies() {
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected E resolve(int index, E object) {
		return (E) resolve(index, (EObject) object);
	}

}