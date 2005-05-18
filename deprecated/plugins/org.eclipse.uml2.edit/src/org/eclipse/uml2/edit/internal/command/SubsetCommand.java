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
 * $Id: SubsetCommand.java,v 1.4 2005/05/18 16:40:46 khussey Exp $
 */
package org.eclipse.uml2.edit.internal.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * @deprecated Use org.eclipse.uml2.common.edit.command.SubsetCommand instead.
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