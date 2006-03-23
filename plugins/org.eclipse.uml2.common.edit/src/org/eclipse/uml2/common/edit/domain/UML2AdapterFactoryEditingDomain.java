/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2AdapterFactoryEditingDomain.java,v 1.1 2006/03/23 18:53:36 khussey Exp $
 */
package org.eclipse.uml2.common.edit.domain;

import java.util.Iterator;
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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

public class UML2AdapterFactoryEditingDomain
		extends AdapterFactoryEditingDomain {

	private static class UniqueListChangeImpl
			extends ListChangeImpl {

		public void apply(EList originalList) {

			switch (getKind().getValue()) {
				case ChangeKind.ADD :

					if (index == -1) {

						for (Iterator v = getValues().iterator(); v.hasNext();) {
							Object value = v.next();

							if (!originalList.contains(value)) {
								originalList.add(value);
							}
						}
					} else {
						EList values = getValues();

						for (ListIterator v = values
							.listIterator(values.size()); v.hasPrevious();) {

							Object value = v.previous();

							if (!originalList.contains(value)) {
								originalList.add(index, value);
							}
						}
					}

					break;
				case ChangeKind.REMOVE :

					for (Iterator v = getValues().iterator(); v.hasNext();) {
						originalList.remove(v.next());
					}

					break;
				default :
					super.apply(originalList);
			}
		}

		public void applyAndReverse(EList originalList) {
			switch (getKind().getValue()) {
				case ChangeKind.ADD :

					if (index == -1) {
						index = originalList.size();

						for (Iterator v = getValues().iterator(); v.hasNext();) {
							Object value = v.next();

							if (!originalList.contains(value)) {
								originalList.add(value);
							}
						}
					} else {
						EList values = getValues();

						for (ListIterator v = values
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

					for (Iterator v = getValues().iterator(); v.hasNext();) {
						originalList.remove(v.next());
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

		protected ListChange createListChange(EList changesList,
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
			CommandStack commandStack, Map resourceToReadOnlyMap) {
		super(adapterFactory, commandStack, resourceToReadOnlyMap);
	}

	public UML2AdapterFactoryEditingDomain(AdapterFactory adapterFactory,
			CommandStack commandStack, ResourceSet resourceSet) {
		super(adapterFactory, commandStack, resourceSet);
	}

	protected ChangeRecorder createChangeRecorder() {
		return new ChangeRecorder() {

			private boolean featureIsUnique = false;

			protected ListChange createListChange(EList changesList,
					ChangeKind kind, int index) {

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

			protected void createRemoveListChange(EList oldList,
					EList changesList, Object newObject, int index) {

				if (featureIsUnique) {
					ListChange listChange = createListChange(changesList,
						ChangeKind.REMOVE_LITERAL, index);
					listChange.getValues().add(oldList.remove(index));
				} else {
					super.createRemoveListChange(oldList, changesList,
						newObject, index);
				}
			}

			protected void finalizeChange(FeatureChange change, EObject eObject) {
				featureIsUnique = change.getFeature().isUnique();

				super.finalizeChange(change, eObject);
			}

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
