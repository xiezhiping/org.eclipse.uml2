/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DerivedEObjectEList.java,v 1.1 2005/10/26 20:58:43 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
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

				while (featureIndex < sourceFeatures.length) {
					EStructuralFeature feature = sourceFeatures[featureIndex++];

					if (owner.eIsSet(feature)) {
						Object value = owner.eGet(feature, resolve());

						if (feature.isMany()
							|| FeatureMapUtil.isFeatureMap(feature)) {

							if (scanNext(feature, resolve()
								? ((List) value).listIterator()
								: ((InternalEList) value).basicListIterator())) {

								prepared = 3;
								return true;
							}
						} else if (isIncluded(feature)
							? value != null
							: isIncluded(value)) {

							values = null;
							preparedFeature = feature;
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
					EStructuralFeature feature = sourceFeatures[--featureIndex];

					if (owner.eIsSet(feature)) {
						Object value = owner.eGet(feature, resolve());

						if (feature.isMany()
							|| FeatureMapUtil.isFeatureMap(feature)) {

							if (scanPrevious(feature, resolve()
								? ((List) value).listIterator()
								: ((InternalEList) value).basicListIterator())) {

								prepared = -3;
								return true;
							}
						} else if (isIncluded(feature)
							? value != null
							: isIncluded(value)) {

							values = null;
							preparedFeature = feature;
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

	protected final EStructuralFeature[] sourceFeatures;

	public DerivedEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, EStructuralFeature[] sourceFeatures) {
		super();

		this.dataClass = dataClass;
		this.owner = owner;
		this.featureID = featureID;
		this.sourceFeatures = sourceFeatures;
	}

	public Object get(boolean resolve) {
		return this;
	}

	public EObject getEObject() {
		return owner;
	}

	public EStructuralFeature getEStructuralFeature() {
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

		if (sourceFeatures != null) {

			for (int i = 0; i < sourceFeatures.length; i++) {
				EStructuralFeature sourceFeature = sourceFeatures[i];

				if (owner.eIsSet(sourceFeature)) {
					Object value = owner.eGet(sourceFeature, false);

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

		if (sourceFeatures != null) {

			for (int i = 0; i < sourceFeatures.length; i++) {
				EStructuralFeature sourceFeature = sourceFeatures[i];

				if (owner.eIsSet(sourceFeature)) {
					Object value = owner.eGet(sourceFeature, false);

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
			sourceFeatures) {

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

	public NotificationChain basicAdd(Object object,
			NotificationChain notifications) {
		addUnique(object);
		return notifications;
	}

	public void addUnique(Object object) {
		addUnique(size(), object);
	}

	public void addUnique(int index, Object object) {
		add(index, validate(index, object));
	}

	public Object setUnique(int index, Object object) {
		return set(index, validate(index, object));
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

		if (sourceFeatures == null) {

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
