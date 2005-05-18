/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: SupersetCommand.java,v 1.4 2005/05/18 16:40:46 khussey Exp $
 */
package org.eclipse.uml2.edit.internal.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * @deprecated Use org.eclipse.uml2.common.edit.command.SupersetCommand instead.
 */
public abstract class SupersetCommand
	extends CompoundCommand {

	protected final EditingDomain domain;

	protected final EObject owner;

	protected final EStructuralFeature feature;

	protected final EStructuralFeature[] subsetFeatures;

	protected final Command supersetCommand;

	protected SupersetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] subsetFeatures,
			Command supersetCommand) {
		super(0);

		this.domain = domain;
		this.owner = owner;
		this.feature = feature;
		this.subsetFeatures = subsetFeatures;
		this.supersetCommand = supersetCommand;
	}

	/**
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {
		appendAndExecute(supersetCommand);
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	protected boolean prepare() {
		return supersetCommand.canExecute();
	}

}