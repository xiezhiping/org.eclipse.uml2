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
 * $Id: SupersetEObjectContainmentEList.java,v 1.4 2006/12/14 15:47:32 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

@Deprecated
public class SupersetEObjectContainmentEList<E>
		extends SupersetEObjectEList<E> {

	private static final long serialVersionUID = 1L;

	public static class Unsettable<E>
			extends SupersetEObjectContainmentEList<E> {

		private static final long serialVersionUID = 1L;

		public static class Resolving<E>
				extends Unsettable<E> {

			private static final long serialVersionUID = 1L;

			public Resolving(Class<?> dataClass, InternalEObject owner,
					int featureID, int[] subsetFeatureIDs) {
				super(dataClass, owner, featureID, subsetFeatureIDs);
			}

			public Resolving(Class<?> dataClass, InternalEObject owner,
					int featureID, int subsetFeatureID) {
				this(dataClass, owner, featureID, new int[]{subsetFeatureID});
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
				int featureID, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, subsetFeatureIDs);
		}

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID});
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
			extends SupersetEObjectContainmentEList<E> {

		private static final long serialVersionUID = 1L;

		public Resolving(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, subsetFeatureIDs);
		}

		public Resolving(Class<?> dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID});
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

	public SupersetEObjectContainmentEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID, subsetFeatureIDs);
	}

	public SupersetEObjectContainmentEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int subsetFeatureID) {
		this(dataClass, owner, featureID, new int[]{subsetFeatureID});
	}

	@Override
	protected boolean hasInverse() {
		return true;
	}

	@Override
	protected boolean hasNavigableInverse() {
		return false;
	}

	@Override
	protected boolean isContainment() {
		return true;
	}

}