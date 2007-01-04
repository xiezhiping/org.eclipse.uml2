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
 * $Id: SubsetSupersetCommand.java,v 1.2 2007/01/04 18:53:35 khussey Exp $
 */
package org.eclipse.uml2.common.edit.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;

public abstract class SubsetSupersetCommand
		extends CompoundCommand {

	protected final EditingDomain domain;

	protected final EObject owner;

	protected final EStructuralFeature feature;

	protected final EStructuralFeature[] supersetFeatures;

	protected final EStructuralFeature[] subsetFeatures;

	protected final Command subsetSupersetCommand;

	protected SubsetSupersetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] supersetFeatures,
			EStructuralFeature[] subsetFeatures, Command subsetSupersetCommand) {
		super(0);

		this.domain = domain;
		this.owner = owner;
		this.feature = feature;
		this.supersetFeatures = supersetFeatures;
		this.subsetFeatures = subsetFeatures;
		this.subsetSupersetCommand = subsetSupersetCommand;
	}

	@Override
	public void execute() {
		appendAndExecute(subsetSupersetCommand);
	}

	@Override
	protected boolean prepare() {
		return subsetSupersetCommand.canExecute();
	}

}