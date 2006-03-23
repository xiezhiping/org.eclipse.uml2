/*
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ChangeCommand.java,v 1.2 2006/03/23 18:53:36 khussey Exp $
 */
package org.eclipse.uml2.common.edit.command;

import java.util.Collections;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.common.edit.domain.UML2AdapterFactoryEditingDomain;

/**
 * 
 */
public class ChangeCommand
		extends AbstractCommand {

	private final EditingDomain editingDomain;

	private final ChangeRecorder changeRecorder;

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

		if (editingDomain == null) {
			throw new IllegalArgumentException(String.valueOf(editingDomain));
		}

		this.editingDomain = editingDomain;
		this.changeRecorder = editingDomain instanceof UML2AdapterFactoryEditingDomain
			? ((UML2AdapterFactoryEditingDomain) editingDomain)
				.getChangeRecorder()
			: new ChangeRecorder();

		if (runnable == null) {
			throw new IllegalArgumentException(String.valueOf(runnable));
		}

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

	protected boolean prepare() {
		return getChangeDescription() == null;
	}

	public boolean canUndo() {
		return getChangeDescription() != null;
	}

	public void execute() {
		changeRecorder.beginRecording(Collections.singleton(getEditingDomain()
			.getResourceSet()));

		try {
			getRunnable().run();
		} finally {
			setChangeDescription(changeRecorder.endRecording());
		}
	}

	public void undo() {
		getChangeDescription().applyAndReverse();
	}

	public void redo() {
		getChangeDescription().applyAndReverse();
	}

}