/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DerivedEObjectEList.java,v 1.4 2006/01/04 21:50:13 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;

public class DerivedEObjectEList
		extends AbstractSequentialList
		implements EStructuralFeature.Setting, InternalEList.Unsettable {

	protected class DerivedListIterator
			implements ListIterator {

		protected int index = 0;

		protected int featureIndex = 0;

		protected ListIterator values = null;

		protected EStructuralFeature preparedFeature = null;

		protected Object preparedValue = null;

		protected int prepared = 0;

		protected boolean scanNext(EStructuralFeature feature,
				ListIterator nextValues) {

			boolean isFeatureMap = FeatureMapUtil.isFeatureMap(feature);

			while (nextValues.hasNext()) {
				Object value = nextValues.next();

				if (isFeatureMap) {
					FeatureMap.Entry entry = (FeatureMap.Entry) value;
					feature = entry.getEStructuralFeature();
					value = entry.getValue();
				}

				if (isIncluded(feature)
					? value != null
					: isIncluded(value)) {

					values = nextValues;
					preparedFeature = feature;
					preparedValue = value;
					return true;
				}
			}

			return false;
		}

		protected boolean prepareNext() {

			if (values == null || !scanNext(preparedFeature, values)) {

				while (featureIndex < sourceFeatureIDs.length) {
					int sourceFeatureID = sourceFeatureIDs[featureIndex++];

					// TODO remove casts to BasicEObjectImpl
					if (((BasicEObjectImpl) owner).eIsSet(sourceFeatureID)) {
						EStructuralFeature sourceFeature = getEStructuralFeature(sourceFeatureID);
						Object value = ((BasicEObjectImpl) owner).eGet(
							sourceFeatureID, resolve(), true);

						if (sourceFeature.isMany()
							|| FeatureMapUtil.isFeatureMap(sourceFeature)) {

							if (scanNext(sourceFeature, resolve()
								? ((List) value).listIterator()
								: ((InternalEList) value).basicListIterator())) {

								prepared = 3;
								return true;
							}
						} else if (isIncluded(sourceFeature)
							? value != null
							: isIncluded(value)) {

							values = null;
							preparedFeature = sourceFeature;
							preparedValue = value;
							prepared = 2;
							return true;
						}
					}
				}

				prepared = 1;
				return false;
			} else {
				prepared = 3;
				return true;
			}
		}

		public boolean hasNext() {

			switch (prepared) {
				case 3 :
				case 2 :
					return true;
				case 1 :
					return false;
				case -3 :
					values.next();
				default :
					return prepareNext();
			}
		}

		public Object next() {

			if (hasNext()) {
				index++;
				prepared = 0;
				return preparedValue;
			} else {
				throw new NoSuchElementException();
			}
		}

		protected boolean scanPrevious(EStructuralFeature feature,
				ListIterator previousValues) {

			boolean isFeatureMap = FeatureMapUtil.isFeatureMap(feature);

			while (previousValues.hasPrevious()) {
				Object value = previousValues.previous();

				if (isFeatureMap) {
					FeatureMap.Entry entry = (FeatureMap.Entry) value;
					feature = entry.getEStructuralFeature();
					value = entry.getValue();
				}

				if (isIncluded(feature)
					? value != null
					: isIncluded(value)) {

					values = previousValues;
					preparedFeature = feature;
					preparedValue = value;
					return true;
				}
			}

			return false;
		}

		protected boolean preparePrevious() {

			if (values == null || !scanPrevious(preparedFeature, values)) {

				while (featureIndex > 0) {
					int sourceFeatureID = sourceFeatureIDs[--featureIndex];

					// TODO remove casts to BasicEObjectImpl
					if (((BasicEObjectImpl) owner).eIsSet(sourceFeatureID)) {
						EStructuralFeature sourceFeature = getEStructuralFeature(sourceFeatureID);
						Object value = ((BasicEObjectImpl) owner).eGet(
							sourceFeatureID, resolve(), true);

						if (sourceFeature.isMany()
							|| FeatureMapUtil.isFeatureMap(sourceFeature)) {

							if (scanPrevious(sourceFeature, resolve()
								? ((List) value).listIterator()
								: ((InternalEList) value).basicListIterator())) {

								prepared = -3;
								return true;
							}
						} else if (isIncluded(sourceFeature)
							? value != null
							: isIncluded(value)) {

							values = null;
							preparedFeature = sourceFeature;
							preparedValue = value;
							prepared = -2;
							return true;
						}
					}
				}

				prepared = -1;
				return false;
			} else {
				prepared = -3;
				return true;
			}
		}

		public boolean hasPrevious() {

			switch (prepared) {
				case -3 :
				case -2 :
					return true;
				case -1 :
					return false;
				case 3 :
					values.previous();
				default :
					return preparePrevious();
			}
		}

		public Object previous() {

			if (hasPrevious()) {
				index--;
				prepared = 0;
				return preparedValue;
			} else {
				throw new NoSuchElementException();
			}
		}

		public int nextIndex() {
			return index;
		}

		public int previousIndex() {
			return index - 1;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public void set(Object element) {
			throw new UnsupportedOperationException();
		}

		public void add(Object element) {
			throw new UnsupportedOperationException();
		}

		protected boolean resolve() {
			return false;
		}

	}

	protected class EmptyDerivedListIterator
			extends DerivedListIterator {

		public boolean hasNext() {
			return false;
		}

		public boolean hasPrevious() {
			return false;
		}
	}

	protected class ResolvingDerivedListIterator
			extends DerivedListIterator {

		protected boolean resolve() {
			return true;
		}

	}

	protected final Class dataClass;

	protected final InternalEObject owner;

	protected final int featureID;

	protected final int[] sourceFeatureIDs;

	public DerivedEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int[] sourceFeatureIDs) {
		super();

		this.dataClass = dataClass;
		this.owner = owner;
		this.featureID = featureID;
		this.sourceFeatureIDs = sourceFeatureIDs;
	}

	public Object get(boolean resolve) {
		return this;
	}

	public EObject getEObject() {
		return owner;
	}

	public EStructuralFeature getEStructuralFeature() {
		return getEStructuralFeature(featureID);
	}

	public EStructuralFeature getEStructuralFeature(int featureID) {
		return owner.eClass().getEStructuralFeature(featureID);
	}

	public boolean isSet() {
		return !isEmpty();
	}

	public void set(Object newValue) {
		clear();
		addAll((List) newValue);
	}

	public void unset() {
		clear();
	}

	public ListIterator listIterator(int index) {
		return listIterator(index, true);
	}

	public int size() {
		int result = 0;

		if (sourceFeatureIDs != null) {

			for (int i = 0; i < sourceFeatureIDs.length; i++) {
				int sourceFeatureID = sourceFeatureIDs[i];

				// TODO remove casts to BasicEObjectImpl
				if (((BasicEObjectImpl) owner).eIsSet(sourceFeatureID)) {
					EStructuralFeature sourceFeature = getEStructuralFeature(sourceFeatureID);
					Object value = ((BasicEObjectImpl) owner).eGet(
						sourceFeatureID, false, true);

					if (FeatureMapUtil.isFeatureMap(sourceFeature)) {
						FeatureMap featureMap = (FeatureMap) value;

						for (int j = 0, size = featureMap.size(); j < size; j++) {

							if (isIncluded(featureMap.getEStructuralFeature(j))
								? featureMap.getValue(j) != null
								: isIncluded(featureMap.getValue(j))) {

								result++;
							}
						}
					} else if (isIncluded(sourceFeature)) {

						if (sourceFeature.isMany()) {
							result += ((List) value).size();
						} else if (value != null) {
							result++;
						}
					} else {

						if (sourceFeature.isMany()) {

							for (Iterator j = ((InternalEList) value)
								.basicIterator(); j.hasNext();) {

								if (isIncluded(j.next())) {
									result++;
								}
							}
						} else if (isIncluded(value)) {
							result++;
						}
					}
				}
			}
		}

		return result;
	}

	public boolean isEmpty() {

		if (sourceFeatureIDs != null) {

			for (int i = 0; i < sourceFeatureIDs.length; i++) {
				int sourceFeatureID = sourceFeatureIDs[i];

				// TODO remove casts to BasicEObjectImpl
				if (((BasicEObjectImpl) owner).eIsSet(sourceFeatureID)) {
					EStructuralFeature sourceFeature = getEStructuralFeature(sourceFeatureID);
					Object value = ((BasicEObjectImpl) owner).eGet(
						sourceFeatureID, false, true);

					if (FeatureMapUtil.isFeatureMap(sourceFeature)) {
						FeatureMap featureMap = (FeatureMap) value;

						for (int j = 0, size = featureMap.size(); j < size; j++) {

							if (isIncluded(featureMap.getEStructuralFeature(j))
								? featureMap.getValue(j) != null
								: isIncluded(featureMap.getValue(j))) {

								return false;
							}
						}
					} else if (isIncluded(sourceFeature)) {

						if (sourceFeature.isMany()
							? ((Collection) value).size() > 0
							: value != null) {

							return false;
						}
					} else {

						if (sourceFeature.isMany()) {

							for (Iterator j = ((Collection) value).iterator(); j
								.hasNext();) {

								if (isIncluded(j.next())) {
									return false;
								}
							}
						} else if (isIncluded(value)) {
							return false;
						}
					}
				}
			}
		}

		return true;
	}

	public Object basicGet(int index) {
		return basicList().get(index);
	}

	public List basicList() {
		return new DerivedEObjectEList(dataClass, owner, featureID,
			sourceFeatureIDs) {

			public ListIterator listIterator(int index) {
				return basicListIterator(index);
			}
		};
	}

	public Iterator basicIterator() {
		return basicListIterator();
	}

	public ListIterator basicListIterator() {
		return basicListIterator(0);
	}

	public ListIterator basicListIterator(int index) {
		return listIterator(index, false);
	}

	public NotificationChain basicRemove(Object object,
			NotificationChain notifications) {
		remove(object);
		return notifications;
	}

	protected boolean isNotificationRequired() {
		return false;
	}

	protected NotificationImpl createNotification(int eventType,
			Object oldObject, Object newObject, int index, boolean wasSet) {
		return new NotificationImpl(eventType, oldObject, newObject, index,
			wasSet) {

			public Object getNotifier() {
				return owner;
			}

			public Object getFeature() {
				return getEStructuralFeature();
			}

			public int getFeatureID(Class expectedClass) {
				return featureID;
			}
		};
	}

	protected void dispatchNotification(Notification notification) {
		owner.eNotify(notification);
	}

	public NotificationChain basicAdd(Object object,
			NotificationChain notifications) {
		addUnique(object);
		return notifications;
	}

	public void add(int index, Object object) {
		addUnique(index, object);
	}

	public void addUnique(Object object) {
		addUnique(size(), object);
	}

	public void addUnique(int index, Object object) {

		if (isNotificationRequired()) {
			boolean oldIsSet = isSet();
			super.add(index, validate(index, object));
			NotificationImpl notification = createNotification(
				Notification.ADD, null, object, index, oldIsSet);
			dispatchNotification(notification);
		} else {
			super.add(index, validate(index, object));
		}
	}

	public Object remove(int index) {

		if (isNotificationRequired()) {
			boolean oldIsSet = isSet();
			NotificationImpl notification = createNotification(
				Notification.REMOVE, super.remove(index), null, index, oldIsSet);
			dispatchNotification(notification);
			return notification.getOldValue();
		} else {
			return super.remove(index);
		}
	}

	public Object set(int index, Object object) {
		return setUnique(index, object);
	}

	public Object setUnique(int index, Object object) {

		if (isNotificationRequired()) {
			boolean oldIsSet = isSet();
			Notification notification = createNotification(Notification.SET,
				super.set(index, validate(index, object)), object, index,
				oldIsSet);
			dispatchNotification(notification);
			return notification.getOldValue();
		} else {
			return super.set(index, validate(index, object));
		}
	}

	public void move(int newPosition, Object object) {
		throw new UnsupportedOperationException();
	}

	public Object move(int newPosition, int oldPosition) {
		throw new UnsupportedOperationException();
	}

	protected boolean isIncluded(EStructuralFeature feature) {
		return dataClass
			.isAssignableFrom(feature.getEType().getInstanceClass());
	}

	protected boolean isIncluded(Object object) {
		return dataClass.isInstance(object);
	}

	protected ListIterator newListIterator() {
		return new DerivedListIterator();
	}

	protected Object validate(int index, Object object) {

		if (!isIncluded(object)) {
			throw new IllegalArgumentException(String.valueOf(object));
		}

		return object;
	}

	protected ListIterator newResolvingListIterator() {
		return new ResolvingDerivedListIterator();
	}

	protected ListIterator newEmptyListIterator() {
		return new EmptyDerivedListIterator();
	}

	protected ListIterator listIterator(int index, boolean resolve) {

		if (sourceFeatureIDs == null || sourceFeatureIDs.length == 0) {

			if (index != 0) {
				throw new IndexOutOfBoundsException("index = " + index //$NON-NLS-1$
					+ ", size = 0"); //$NON-NLS-1$
			}

			return newEmptyListIterator();
		}

		ListIterator listIterator = resolve
			? newResolvingListIterator()
			: newListIterator();

		for (int i = 0; i < index; i++) {
			listIterator.next();
		}

		return listIterator;
	}

}
