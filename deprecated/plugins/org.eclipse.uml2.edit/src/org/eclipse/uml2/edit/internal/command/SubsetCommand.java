/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.uml2.edit.internal.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 *
 */
public abstract class SubsetCommand
	extends CompoundCommand {

	protected final EditingDomain domain;

	protected final EObject owner;

	protected final EStructuralFeature feature;

	protected final EStructuralFeature[] supersetFeatures;

	protected final Command subsetCommand;

	protected SubsetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] supersetFeatures,
			Command subsetCommand) {
		super(0);

		this.domain = domain;
		this.owner = owner;
		this.feature = feature;
		this.supersetFeatures = supersetFeatures;
		this.subsetCommand = subsetCommand;
	}

	/**
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	public void execute() {
		appendAndExecute(subsetCommand);
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	protected boolean prepare() {
		return subsetCommand.canExecute();
	}

}