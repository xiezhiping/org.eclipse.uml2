/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SubsetEObjectContainmentWithInverseEList.java,v 1.4 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;

/**
 *  
 */
public class SubsetEObjectContainmentWithInverseEList
	extends SubsetEObjectContainmentEList {

	public static class Unsettable
		extends SubsetEObjectContainmentWithInverseEList {

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				inverseFeatureID);
		}

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int supersetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[]{supersetFeatureID},
				inverseFeatureID);
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

	protected final int inverseFeatureID;

	public SubsetEObjectContainmentWithInverseEList(Class dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs,
			int inverseFeatureID) {
		super(dataClass, owner, featureID, supersetFeatureIDs);

		this.inverseFeatureID = inverseFeatureID;
	}

	public SubsetEObjectContainmentWithInverseEList(Class dataClass,
			InternalEObject owner, int featureID, int supersetFeatureID,
			int inverseFeatureID) {
		this(dataClass, owner, featureID, new int[]{supersetFeatureID},
			inverseFeatureID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreEList#hasNavigableInverse()
	 */
	protected boolean hasNavigableInverse() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreEList#getInverseFeatureID()
	 */
	public int getInverseFeatureID() {
		return inverseFeatureID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreEList#getInverseFeatureClass()
	 */
	public Class getInverseFeatureClass() {
		return dataClass;
	}

}