/*
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2AdapterFactoryEditingDomain.java,v 1.2 2007/01/04 18:53:45 khussey Exp $
 */
package org.eclipse.uml2.common.edit.domain;

import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeKind;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.ListChange;
import org.eclipse.emf.ecore.change.impl.FeatureChangeImpl;
import org.eclipse.emf.ecore.change.impl.ListChangeImpl;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

public class UML2AdapterFactoryEditingDomain
		extends AdapterFactoryEditingDomain {

	private static class UniqueListChangeImpl
			extends ListChangeImpl {

		@Override
		public void apply(EList<Object> originalList) {

			switch (getKind().getValue()) {
				case ChangeKind.ADD :

					if (index == -1) {

						for (Object value : getValues()) {

							if (!originalList.contains(value)) {
								originalList.add(value);
							}
						}
					} else {
						EList<Object> values = getValues();

						for (ListIterator<Object> v = values
							.listIterator(values.size()); v.hasPrevious();) {

							Object value = v.previous();

							if (!originalList.contains(value)) {
								originalList.add(index, value);
							}
						}
					}

					break;
				case ChangeKind.REMOVE :

					for (Object value : getValues()) {
						originalList.remove(value);
					}

					break;
				default :
					super.apply(originalList);
			}
		}

		@Override
		public void applyAndReverse(EList<Object> originalList) {
			switch (getKind().getValue()) {
				case ChangeKind.ADD :

					if (index == -1) {
						index = originalList.size();

						for (Object value : getValues()) {

							if (!originalList.contains(value)) {
								originalList.add(value);
							}
						}
					} else {
						EList<Object> values = getValues();

						for (ListIterator<Object> v = values
							.listIterator(values.size()); v.hasPrevious();) {

							Object value = v.previous();

							if (!originalList.contains(value)) {
								originalList.add(index, value);
							}
						}
					}

					setKind(ChangeKind.REMOVE_LITERAL);

					break;
				case ChangeKind.REMOVE :

					for (Object value : getValues()) {
						originalList.remove(value);
					}

					setKind(ChangeKind.ADD_LITERAL);

					break;
				default :
					super.applyAndReverse(originalList);
			}
		}

	}

	private static final class UniqueFeatureChangeImpl
			extends FeatureChangeImpl {

		protected UniqueFeatureChangeImpl(EStructuralFeature feature,
				Object value, boolean isSet) {
			super(feature, value, isSet);
		}

		@Override
		protected ListChange createListChange(EList<ListChange> changesList,
				ChangeKind kind, int index) {

			if (getFeature().isUnique()) {
				ListChange listChange = new UniqueListChangeImpl();

				listChange.setKind(kind);
				listChange.setIndex(index);

				changesList.add(listChange);

				return listChange;
			} else {
				return super.createListChange(changesList, kind, index);
			}
		}

	}

	protected ChangeRecorder changeRecorder = null;

	public UML2AdapterFactoryEditingDomain(AdapterFactory adapterFactory,
			CommandStack commandStack) {
		super(adapterFactory, commandStack);
	}

	public UML2AdapterFactoryEditingDomain(AdapterFactory adapterFactory,
			CommandStack commandStack,
			Map<Resource, Boolean> resourceToReadOnlyMap) {
		super(adapterFactory, commandStack, resourceToReadOnlyMap);
	}

	public UML2AdapterFactoryEditingDomain(AdapterFactory adapterFactory,
			CommandStack commandStack, ResourceSet resourceSet) {
		super(adapterFactory, commandStack, resourceSet);
	}

	protected ChangeRecorder createChangeRecorder() {
		return new ChangeRecorder() {

			private boolean featureIsUnique = false;

			@Override
			protected ListChange createListChange(
					EList<ListChange> changesList, ChangeKind kind, int index) {

				if (featureIsUnique) {
					ListChange listChange = new UniqueListChangeImpl();

					listChange.setKind(kind);
					listChange.setIndex(index);

					changesList.add(listChange);

					return listChange;
				} else {
					return super.createListChange(changesList, kind, index);
				}
			}

			@Override
			protected void createRemoveListChange(EList<?> oldList,
					EList<ListChange> changesList, Object newObject, int index) {

				if (featureIsUnique) {
					ListChange listChange = createListChange(changesList,
						ChangeKind.REMOVE_LITERAL, index);
					listChange.getValues().add(oldList.remove(index));
				} else {
					super.createRemoveListChange(oldList, changesList,
						newObject, index);
				}
			}

			@Override
			protected void finalizeChange(FeatureChange change, EObject eObject) {
				featureIsUnique = change.getFeature().isUnique();

				super.finalizeChange(change, eObject);
			}

			@Override
			protected FeatureChange createFeatureChange(EObject eObject,
					EStructuralFeature eStructuralFeature, Object value,
					boolean isSet) {

				return new UniqueFeatureChangeImpl(eStructuralFeature, value,
					isSet);
			}

		};
	}

	public ChangeRecorder getChangeRecorder() {

		if (changeRecorder == null) {
			changeRecorder = createChangeRecorder();
		}

		return changeRecorder;
	}

}
