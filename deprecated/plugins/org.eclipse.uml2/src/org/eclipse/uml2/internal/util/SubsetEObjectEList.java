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
 * $Id: SubsetEObjectEList.java,v 1.4 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 *  
 */
public class SubsetEObjectEList
	extends EObjectEList {

	public static class Unsettable
		extends SubsetEObjectEList {

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs) {
			super(dataClass, owner, featureID, supersetFeatureIDs);
		}

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int supersetFeatureID) {
			this(dataClass, owner, featureID, new int[]{supersetFeatureID});
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

	protected final int[] supersetFeatureIDs;

	public SubsetEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int[] supersetFeatureIDs) {
		super(dataClass, owner, featureID);

		this.supersetFeatureIDs = supersetFeatureIDs;
	}

	public SubsetEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int supersetFeatureID) {
		this(dataClass, owner, featureID, new int[]{supersetFeatureID});
	}

	protected void supersetAdd(Object object) {

		for (int i = 0; i < supersetFeatureIDs.length; i++) {
			EStructuralFeature supersetEStructuralFeature = owner.eClass()
				.getEStructuralFeature(supersetFeatureIDs[i]);

			if (supersetEStructuralFeature.isMany()) {
				EList supersetEList = (EList) owner
					.eGet(supersetEStructuralFeature);

				if (!supersetEList.contains(object)) {
					supersetEList.add(object);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.NotifyingListImpl#basicAdd(java.lang.Object,
	 *      org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain basicAdd(Object object,
			NotificationChain notifications) {
		notifications = super.basicAdd(object, notifications);

		supersetAdd(object);

		return notifications;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.NotifyingListImpl#basicSet(int,
	 *      java.lang.Object, org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain basicSet(int index, Object object,
			NotificationChain notifications) {
		notifications = super.basicSet(index, object, notifications);

		supersetAdd(object);

		return notifications;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.List#add(int, java.lang.Object)
	 */
	public void add(int index, Object object) {
		super.add(index, object);

		supersetAdd(object);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Collection#add(java.lang.Object)
	 */
	public boolean add(Object object) {
		boolean result = super.add(object);

		supersetAdd(object);

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Collection#addAll(java.util.Collection)
	 */
	public boolean addAll(Collection collection) {
		boolean result = super.addAll(collection);

		for (Iterator elements = collection.iterator(); elements.hasNext();) {
			supersetAdd(elements.next());
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.List#addAll(int, java.util.Collection)
	 */
	public boolean addAll(int index, Collection collection) {
		boolean result = super.addAll(index, collection);

		for (Iterator elements = collection.iterator(); elements.hasNext();) {
			supersetAdd(elements.next());
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.List#set(int, java.lang.Object)
	 */
	public Object set(int index, Object object) {
		Object result = super.set(index, object);

		supersetAdd(object);

		return result;
	}

}