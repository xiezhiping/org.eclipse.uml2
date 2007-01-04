/*
 * Copyright (c) 2004, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ChangeCommand.java,v 1.4 2007/01/04 18:53:35 khussey Exp $
 */
package org.eclipse.uml2.common.edit.command;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.common.edit.domain.UML2AdapterFactoryEditingDomain;

public class ChangeCommand
		extends org.eclipse.emf.edit.command.ChangeCommand {

	private final EditingDomain editingDomain;

	private final Runnable runnable;

	public ChangeCommand(EditingDomain editingDomain, Runnable runnable) {
		this(editingDomain, runnable, null);
	}

	public ChangeCommand(EditingDomain editingDomain, Runnable runnable,
			String label) {
		this(editingDomain, runnable, label, null);
	}

	public ChangeCommand(EditingDomain editingDomain, Runnable runnable,
			String label, String description) {
		super(editingDomain.getResourceSet());

		this.editingDomain = editingDomain;

		if (editingDomain instanceof UML2AdapterFactoryEditingDomain) {
			this.changeRecorder = ((UML2AdapterFactoryEditingDomain) editingDomain)
				.getChangeRecorder();
		}

		if (runnable == null) {
			throw new IllegalArgumentException(String.valueOf(runnable));
		}

		this.runnable = runnable;

		setLabel(label);
		setDescription(description);
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	protected Runnable getRunnable() {
		return runnable;
	}

	@Override
	protected void doExecute() {
		getRunnable().run();
	}

}