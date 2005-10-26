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
 * $Id: DerivedSubsetEObjectEList.java,v 1.1 2005/10/26 20:58:43 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;

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

			values.remove();

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

			values.set(element);

			modCount++;
			expectedModCount++;
		}

		public void add(Object element) {
			checkModCount();

			if (values == null) {
				(resolve()
					? ((List) owner.eGet(sourceFeatures[featureIndex],
						resolve())).listIterator()
					: ((InternalEList) owner.eGet(sourceFeatures[featureIndex],
						resolve())).basicListIterator()).add(element);
			} else {

				switch (prepared) {
					case 3 :
						preparePrevious();
						break;
					case -3 :
						prepareNext();
						break;
				}

				values.add(element);
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
			int featureID, EStructuralFeature[] sourceFeatures) {

		super(dataClass, owner, featureID, sourceFeatures);

		for (int i = 0; i < sourceFeatures.length; i++) {
			EStructuralFeature feature = sourceFeatures[i];

			if (!feature.isMany() || FeatureMapUtil.isFeatureMap(feature)) {
				throw new IllegalArgumentException(String
					.valueOf(sourceFeatures));
			}
		}

	}

	public List basicList() {
		return new DerivedSubsetEObjectEList(dataClass, owner, featureID,
			sourceFeatures) {

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
}
