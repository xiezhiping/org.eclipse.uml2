/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ChangeCommand.java,v 1.3 2004/06/17 19:49:16 khussey Exp $
 */
package org.eclipse.uml2.edit.util;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.ChangeKind;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.ListChange;
import org.eclipse.emf.ecore.change.impl.ListChangeImpl;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 *  
 */
public class ChangeCommand
	extends AbstractCommand {

	private static class UniqueListChangeImpl
		extends ListChangeImpl {

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.change.ListChange#apply(org.eclipse.emf.common.util.EList)
		 */
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

	}

	private static final ChangeRecorder CHANGE_RECORDER = new ChangeRecorder() {

		protected ListChange createUniqueListChange(EList changesList,
				ChangeKind kind, int index) {
			ListChange listChange = new UniqueListChangeImpl();

			listChange.setKind(kind);
			listChange.setIndex(index);

			changesList.add(listChange);

			return listChange;
		}

		protected void createUniqueListChanges(EList oldList, EList newList,
				EList changesList) {
			int index = 0;

			for (Iterator objects = newList.iterator(); objects.hasNext(); ++index) {
				Object newObject = objects.next();

				if (oldList.size() <= index) {
					ListChange listChange = createUniqueListChange(changesList,
						ChangeKind.ADD_LITERAL, index);
					listChange.getValues().add(newObject);
					oldList.add(newObject);
				} else {
					boolean done;

					do {
						done = true;
						Object targetObject = oldList.get(index);

						if (null == targetObject
							? null != newObject
							: !targetObject.equals(newObject)) {

							int position = EcoreUtil.indexOf(oldList,
								newObject, index);

							if (-1 != position) {
								int targetIndex = EcoreUtil.indexOf(newList,
									targetObject, index);

								if (-1 == targetIndex) {
									ListChange listChange = createUniqueListChange(
										changesList, ChangeKind.REMOVE_LITERAL,
										index);
									listChange.getValues().add(
										oldList.remove(index));
									done = false;
								} else if (targetIndex > position) {

									if (oldList.size() <= targetIndex) {
										targetIndex = oldList.size() - 1;
									}

									ListChange listChange = createUniqueListChange(
										changesList, ChangeKind.MOVE_LITERAL,
										index);
									listChange.setMoveToIndex(targetIndex);
									oldList.move(targetIndex, index);
									done = false;
								} else {
									ListChange listChange = createUniqueListChange(
										changesList, ChangeKind.MOVE_LITERAL,
										position);
									listChange.setMoveToIndex(index);
									oldList.move(index, position);
								}
							} else {
								ListChange listChange = createUniqueListChange(
									changesList, ChangeKind.ADD_LITERAL, index);
								listChange.getValues().add(newObject);
								oldList.add(index, newObject);
							}
						}
					} while (!done);
				}
			}

			for (int i = oldList.size(); i > index;) {
				ListChange listChange = createUniqueListChange(changesList,
					ChangeKind.REMOVE_LITERAL, --i);
				listChange.getValues().add(oldList.remove(i));
			}
		}

		protected void finalizeChange(FeatureChange change, EObject eObject) {

			if (change.isSet()) {
				EStructuralFeature feature = change.getFeature();

				if (feature.isMany()) {
					EList oldList = new BasicEList((EList) eObject
						.eGet(feature));
					EList newList = (EList) change.getValue();

					if (feature.isUnique()) {
						createUniqueListChanges(oldList, newList, change
							.getListChanges());
					} else {
						createListChanges(oldList, newList, change
							.getListChanges());
					}
				}
			}
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
			CHANGE_RECORDER.beginRecording(Collections
				.singleton(getEditingDomain().getResourceSet()));

			try {
				getChangeDescription().apply();
			} finally {
				setChangeDescription(CHANGE_RECORDER.endRecording());
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	public void redo() {

		synchronized (CHANGE_RECORDER) {
			CHANGE_RECORDER.beginRecording(Collections
				.singleton(getEditingDomain().getResourceSet()));

			try {
				getChangeDescription().apply();
			} finally {
				setChangeDescription(CHANGE_RECORDER.endRecording());
			}
		}
	}

}