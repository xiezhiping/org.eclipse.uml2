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
 * $Id: ChangeCommand.java,v 1.2 2004/04/10 03:58:45 khussey Exp $
 */
package org.eclipse.uml2.edit.util;

import java.util.Collections;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.internal.util.SubsetEObjectEList;
import org.eclipse.uml2.internal.util.SupersetEObjectEList;

/**
 *  
 */
public class ChangeCommand
	extends AbstractCommand {

	private static final ChangeRecorder CHANGE_RECORDER = new ChangeRecorder() {

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.change.util.ChangeRecorder#handleFeature(org.eclipse.emf.ecore.EStructuralFeature,
		 *      org.eclipse.emf.ecore.EReference,
		 *      org.eclipse.emf.common.notify.Notification)
		 */
		protected void handleFeature(EStructuralFeature feature,
				EReference containment, Notification notification) {

			switch (notification.getEventType()) {
				case Notification.ADD:
				case Notification.ADD_MANY:
					if (!SubsetEObjectEList.class
						.isInstance(((EObject) notification.getNotifier())
							.eGet(feature))) {

						super.handleFeature(feature, containment, notification);
					}
					break;
				case Notification.REMOVE:
				case Notification.REMOVE_MANY:
					if (!SupersetEObjectEList.class
						.isInstance(((EObject) notification.getNotifier())
							.eGet(feature))) {

						super.handleFeature(feature, containment, notification);
					}
					break;
				default:
					super.handleFeature(feature, containment, notification);
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
		//		
		//		getChangeDescription().applyAndReverse();
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
		//		
		//		getChangeDescription().applyAndReverse();
	}

}