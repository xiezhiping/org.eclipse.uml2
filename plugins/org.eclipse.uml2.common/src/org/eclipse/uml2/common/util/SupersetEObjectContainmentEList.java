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
 * $Id: SupersetEObjectContainmentEList.java,v 1.3 2006/01/05 13:49:53 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * @deprecated Use SubsetSupersetEObjectContainmentEList
 */
public class SupersetEObjectContainmentEList
		extends SupersetEObjectEList {

	public static class Unsettable
			extends SupersetEObjectContainmentEList {

		public static class Resolving
				extends Unsettable {

			public Resolving(Class dataClass, InternalEObject owner,
					int featureID, int[] subsetFeatureIDs) {
				super(dataClass, owner, featureID, subsetFeatureIDs);
			}

			public Resolving(Class dataClass, InternalEObject owner,
					int featureID, int subsetFeatureID) {
				this(dataClass, owner, featureID, new int[]{subsetFeatureID});
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
				int featureID, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, subsetFeatureIDs);
		}

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID});
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.common.util.BasicEList#didChange()
		 */
		protected void didChange() {
			isSet = true;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.common.notify.impl.NotifyingListImpl#isSet()
		 */
		public boolean isSet() {
			return isSet;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.EStructuralFeature.Setting#unset()
		 */
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
			extends SupersetEObjectContainmentEList {

		public Resolving(Class dataClass, InternalEObject owner, int featureID,
				int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, subsetFeatureIDs);
		}

		public Resolving(Class dataClass, InternalEObject owner, int featureID,
				int subsetFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID});
		}

		protected boolean hasProxies() {
			return true;
		}

		protected Object resolve(int index, Object object) {
			return resolve(index, (EObject) object);
		}
	}

	public SupersetEObjectContainmentEList(Class dataClass,
			InternalEObject owner, int featureID, int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID, subsetFeatureIDs);
	}

	public SupersetEObjectContainmentEList(Class dataClass,
			InternalEObject owner, int featureID, int subsetFeatureID) {
		this(dataClass, owner, featureID, new int[]{subsetFeatureID});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.NotifyingListImpl#hasInverse()
	 */
	protected boolean hasInverse() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreEList#hasNavigableInverse()
	 */
	protected boolean hasNavigableInverse() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreEList#isContainment()
	 */
	protected boolean isContainment() {
		return true;
	}

}