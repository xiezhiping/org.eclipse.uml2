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
 * $Id: DerivedSubsetEObjectEList.java,v 1.8 2006/12/14 15:47:33 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * @since 1.2
 */
public class DerivedSubsetEObjectEList<E>
		extends DerivedEObjectEList<E> {

	protected class DerivedSubsetListIterator
			extends DerivedListIterator {

		protected int expectedModCount = modCount;

		@Override
		public void remove() {
			checkModCount();

			if (valuesIterator == null) {
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

			valuesIterator.remove();

			modCount++;
			expectedModCount++;
		}

		@Override
		public void set(Object element) {
			checkModCount();

			if (valuesIterator == null) {
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

			valuesIterator.set(element);

			modCount++;
			expectedModCount++;
		}

		@Override
		public void add(Object element) {
			checkModCount();

			if (valuesIterator == null) {
				@SuppressWarnings("unchecked")
				List<Object> valuesList = resolve()
					? (List<Object>) owner.eGet(sourceFeatureIDs[featureIndex],
						resolve(), true)
					: ((InternalEList<Object>) owner.eGet(
						sourceFeatureIDs[featureIndex], resolve(), true))
						.basicList();

				valuesList.listIterator().add(element);
			} else {

				switch (prepared) {
					case 3 :
						preparePrevious();
						break;
					case -3 :
						prepareNext();
						break;
				}

				valuesIterator.add(element);
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

		@Override
		protected boolean resolve() {
			return true;
		}

	}

	protected class EmptyDerivedSubsetListIterator
			extends EmptyDerivedListIterator {

		@Override
		public void remove() {
			throw new IllegalStateException();
		}

		@Override
		public void set(Object element) {
			throw new IllegalStateException();
		}

		@Override
		public void add(Object element) {
			throw new IllegalStateException();
		}

	}

	public DerivedSubsetEObjectEList(Class<?> dataClass, InternalEObject owner,
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

	@Override
	public List<E> basicList() {

		return new DerivedSubsetEObjectEList<E>(dataClass, owner, featureID,
			sourceFeatureIDs) {

			@Override
			public ListIterator<E> listIterator(int index) {
				return basicListIterator(index);
			}
		};
	}

	@Override
	protected ListIterator<E> newListIterator() {
		return new DerivedSubsetListIterator();
	}

	@Override
	protected ListIterator<E> newResolvingListIterator() {
		return new ResolvingDerivedSubsetListIterator();
	}

	@Override
	protected ListIterator<E> newEmptyListIterator() {
		return new EmptyDerivedSubsetListIterator();
	}

	@Override
	protected boolean isNotificationRequired() {
		return owner.eNotificationRequired();
	}

}
