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
 * $Id: SupersetEObjectResolvingEList.java,v 1.5 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 *  
 */
public class SupersetEObjectResolvingEList
	extends SupersetEObjectEList {

	public static class Unsettable
		extends SupersetEObjectResolvingEList {

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

	public SupersetEObjectResolvingEList(Class dataClass,
			InternalEObject owner, int featureID, int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID, subsetFeatureIDs);
	}

	public SupersetEObjectResolvingEList(Class dataClass,
			InternalEObject owner, int featureID, int subsetFeatureID) {
		this(dataClass, owner, featureID, new int[]{subsetFeatureID});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreEList#hasProxies()
	 */
	protected boolean hasProxies() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.BasicEList#resolve(int,
	 *      java.lang.Object)
	 */
	protected Object resolve(int index, Object object) {
		return resolve(index, (EObject) object);
	}

}