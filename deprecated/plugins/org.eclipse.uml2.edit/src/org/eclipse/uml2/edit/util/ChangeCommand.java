/*
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ChangeCommand.java,v 1.8 2005/04/18 20:20:18 khussey Exp $
 */
package org.eclipse.uml2.edit.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.ChangeKind;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.ListChange;
import org.eclipse.emf.ecore.change.impl.FeatureChangeImpl;
import org.eclipse.emf.ecore.change.impl.ListChangeImpl;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * 
 */
public class ChangeCommand
		extends AbstractCommand {

	private static class UniqueListChangeImpl
			extends ListChangeImpl {

		public void apply(EList originalList) {

			switch (getKind().getValue()) {
				case ChangeKind.ADD :

					if (-1 == index) {

						for (Iterator values = getValues().iterator(); values
							.hasNext();) {

							Object value = values.next();

							if (!originalList.contains(value)) {
								originalList.add(value);
							}
						}
					} else {

						for (ListIterator values = getValues().listIterator(
							getValues().size()); values.hasPrevious();) {

							Object value = values.previous();

							if (!originalList.contains(value)) {
								originalList.add(index, value);
							}
						}
					}

					break;
				case ChangeKind.REMOVE :

					for (Iterator values = getValues().iterator(); values
						.hasNext();) {

						originalList.remove(values.next());
					}

					break;
				default :
					super.apply(originalList);
			}
		}

		public void applyAndReverse(EList originalList) {
			switch (getKind().getValue()) {
				case ChangeKind.ADD :

					if (-1 == index) {
						index = originalList.size();

						for (Iterator values = getValues().iterator(); values
							.hasNext();) {

							Object value = values.next();

							if (!originalList.contains(value)) {
								originalList.add(value);
							}
						}
					} else {

						for (ListIterator values = getValues().listIterator(
							getValues().size()); values.hasPrevious();) {

							Object value = values.previous();

							if (!originalList.contains(value)) {
								originalList.add(index, value);
							}
						}
					}

					setKind(ChangeKind.REMOVE_LITERAL);

					break;
				case ChangeKind.REMOVE :

					for (Iterator values = getValues().iterator(); values
						.hasNext();) {

						originalList.remove(values.next());
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

	private static final ChangeRecorder CHANGE_RECORDER = new ChangeRecorder() {

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

		protected void createRemoveListChange(EList oldList, EList changesList,
				Object newObject, int index) {

			if (featureIsUnique) {
				ListChange listChange = createListChange(changesList,
					ChangeKind.REMOVE_LITERAL, index);
				listChange.getValues().add(oldList.remove(index));
			} else {
				super.createRemoveListChange(oldList, changesList, newObject,
					index);
			}
		}

		protected void finalizeChange(FeatureChange change, EObject eObject) {
			featureIsUnique = change.getFeature().isUnique();

			super.finalizeChange(change, eObject);
		}

		protected FeatureChange createFeatureChange(EObject eObject,
				EStructuralFeature eStructuralFeature, Object value,
				boolean isSet) {

			return new UniqueFeatureChangeImpl(eStructuralFeature, value, isSet);
		}

	};

	private final EditingDomain editingDomain;

	private final Runnable runnable;

	private ChangeDescription changeDescription = null;

	public ChangeCommand(EditingDomain editingDomain, Runnable runnable) {
		this(editingDomain, runnable, null);
	}

	public ChangeCommand(EditingDomain editingDomain, Runnable runnable,
			String label) {
		this(editingDomain, runnable, label, null);
	}

	public ChangeCommand(EditingDomain editingDomain, Runnable runnable,
			String label, String description) {
		super(label, description);

		if (null == editingDomain) {
			throw new IllegalArgumentException(String.valueOf(editingDomain));
		}

		if (null == runnable) {
			throw new IllegalArgumentException(String.valueOf(runnable));
		}

		this.editingDomain = editingDomain;
		this.runnable = runnable;
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	protected Runnable getRunnable() {
		return runnable;
	}

	protected ChangeDescription getChangeDescription() {
		return changeDescription;
	}

	protected void setChangeDescription(ChangeDescription changeDescription) {
		this.changeDescription = changeDescription;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	protected boolean prepare() {
		return null == getChangeDescription();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#canUndo()
	 */
	public boolean canUndo() {
		return null != getChangeDescription();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {

		synchronized (CHANGE_RECORDER) {
			CHANGE_RECORDER.beginRecording(Collections
				.singleton(getEditingDomain().getResourceSet()));

			try {
				getRunnable().run();
			} finally {
				setChangeDescription(CHANGE_RECORDER.endRecording());
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#undo()
	 */
	public void undo() {

		synchronized (CHANGE_RECORDER) {
			getChangeDescription().applyAndReverse();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void redo() {

		synchronized (CHANGE_RECORDER) {
			getChangeDescription().applyAndReverse();
		}
	}

}