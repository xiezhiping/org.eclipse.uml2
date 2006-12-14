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
 * $Id: SupersetEObjectContainmentWithInverseEList.java,v 1.4 2006/12/14 15:47:32 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

@Deprecated
public class SupersetEObjectContainmentWithInverseEList<E>
		extends SupersetEObjectContainmentEList<E> {

	private static final long serialVersionUID = 1L;

	public static class Unsettable<E>
			extends SupersetEObjectContainmentWithInverseEList<E> {

		private static final long serialVersionUID = 1L;

		public static class Resolving<E>
				extends Unsettable<E> {

			private static final long serialVersionUID = 1L;

			public Resolving(Class<?> dataClass, InternalEObject owner,
					int featureID, int[] subsetFeatureIDs, int inverseFeatureID) {
				super(dataClass, owner, featureID, subsetFeatureIDs,
					inverseFeatureID);
			}

			public Resolving(Class<?> dataClass, InternalEObject owner,
					int featureID, int subsetFeatureID, int inverseFeatureID) {
				this(dataClass, owner, featureID, new int[]{subsetFeatureID},
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

		protected boolean isSet;

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, subsetFeatureIDs,
				inverseFeatureID);
		}

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID},
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

	public static class Resolving<E>
			extends SupersetEObjectContainmentWithInverseEList<E> {

		private static final long serialVersionUID = 1L;

		public Resolving(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, subsetFeatureIDs,
				inverseFeatureID);
		}

		public Resolving(Class<?> dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID},
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

	protected final int inverseFeatureID;

	public SupersetEObjectContainmentWithInverseEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int[] subsetFeatureIDs,
			int inverseFeatureID) {
		super(dataClass, owner, featureID, subsetFeatureIDs);

		this.inverseFeatureID = inverseFeatureID;
	}

	public SupersetEObjectContainmentWithInverseEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int subsetFeatureID,
			int inverseFeatureID) {
		this(dataClass, owner, featureID, new int[]{subsetFeatureID},
			inverseFeatureID);
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