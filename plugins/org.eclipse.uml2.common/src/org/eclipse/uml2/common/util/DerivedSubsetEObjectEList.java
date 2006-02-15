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
 * $Id: DerivedSubsetEObjectEList.java,v 1.5 2006/02/15 16:36:16 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;

public class DerivedSubsetEObjectEList
		extends DerivedEObjectEList {

	protected class DerivedSubsetListIterator
			extends DerivedListIterator {

		protected int expectedModCount = modCount;

		public void remove() {
			checkModCount();

			if (values == null) {
				throw new IllegalStateException();
			}

			switch (prepared) {
				case 3 :
					preparePrevious();
					break;
				case -3 :
					prepareNext();
					break;
			}

			prepared = 0;

			if (valuesIterator == null) {
				values.remove(valuesIndex);
			} else {
				valuesIterator.remove();
			}

			modCount++;
			expectedModCount++;
		}

		public void set(Object element) {
			checkModCount();

			if (values == null) {
				throw new IllegalStateException();
			}

			switch (prepared) {
				case 3 :
					preparePrevious();
					break;
				case -3 :
					prepareNext();
					break;
			}

			prepared = 0;

			if (valuesIterator == null) {
				values.set(valuesIndex, element);
			} else {
				valuesIterator.set(element);
			}

			modCount++;
			expectedModCount++;
		}

		public void add(Object element) {
			checkModCount();

			if (values == null) {
				List valuesList = resolve()
					? (List) owner.eGet(sourceFeatureIDs[featureIndex],
						resolve(), true)
					: ((InternalEList) owner.eGet(
						sourceFeatureIDs[featureIndex], resolve(), true))
						.basicList();

				if (valuesList instanceof RandomAccess) {
					valuesList.add(0, element);
				} else {
					valuesList.listIterator().add(element);
				}
			} else {

				switch (prepared) {
					case 3 :
						preparePrevious();
						break;
					case -3 :
						prepareNext();
						break;
				}

				if (valuesIterator == null) {
					values.add(valuesIndex, element);
				} else {
					valuesIterator.add(element);
				}
			}

			prepared = 0;

			modCount++;
			expectedModCount++;

			index++;
		}

		protected void checkModCount() {

			if (modCount != expectedModCount) {
				throw new ConcurrentModificationException();
			}
		}
	}

	protected class ResolvingDerivedSubsetListIterator
			extends DerivedSubsetListIterator {

		protected boolean resolve() {
			return true;
		}

	}

	protected class EmptyDerivedSubsetListIterator
			extends EmptyDerivedListIterator {

		public void remove() {
			throw new IllegalStateException();
		}

		public void set(Object element) {
			throw new IllegalStateException();
		}

		public void add(Object element) {
			throw new IllegalStateException();
		}

	}

	public DerivedSubsetEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int[] sourceFeatureIDs) {
		super(dataClass, owner, featureID, sourceFeatureIDs);

		for (int i = 0; i < sourceFeatureIDs.length; i++) {
			EStructuralFeature feature = getEStructuralFeature(sourceFeatureIDs[i]);

			if (!feature.isMany() || FeatureMapUtil.isFeatureMap(feature)) {
				throw new IllegalArgumentException(String
					.valueOf(sourceFeatureIDs));
			}
		}

	}

	public List basicList() {

		return new DerivedSubsetEObjectEList(dataClass, owner, featureID,
			sourceFeatureIDs) {

			public ListIterator listIterator(int index) {
				return basicListIterator(index);
			}
		};
	}

	protected ListIterator newListIterator() {
		return new DerivedSubsetListIterator();
	}

	protected ListIterator newResolvingListIterator() {
		return new ResolvingDerivedSubsetListIterator();
	}

	protected ListIterator newEmptyListIterator() {
		return new EmptyDerivedSubsetListIterator();
	}

	protected boolean isNotificationRequired() {
		return owner.eNotificationRequired();
	}

}
