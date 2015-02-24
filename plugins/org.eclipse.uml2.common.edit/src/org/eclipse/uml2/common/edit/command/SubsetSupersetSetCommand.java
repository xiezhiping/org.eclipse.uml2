/*
 * Copyright (c) 2006, 2015 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 459723
 *
 */
package org.eclipse.uml2.common.edit.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class SubsetSupersetSetCommand
		extends SubsetSupersetCommand {

	protected final Object value;

	public SubsetSupersetSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] supersetFeatures,
			EStructuralFeature[] subsetFeatures, Object value) {
		super(domain, owner, feature, supersetFeatures, subsetFeatures,
			new SetCommand(domain, owner, feature, value));

		this.value = value;
	}

	@Override
	public void execute() {

		if (feature.isMany()) {
			Collection<?> collection = (Collection<?>) value;

			if (supersetFeatures != null) {

				for (Object element : collection) {

					for (int i = 0; i < supersetFeatures.length; i++) {

						if (supersetFeatures[i].isMany()) {
							Collection<?> values = (Collection<?>) owner
								.eGet(supersetFeatures[i]);

							if (!values.contains(element)) {
								appendAndExecute(AddCommand.create(domain,
									owner, supersetFeatures[i],
									Collections.singleton(element),
									CommandParameter.NO_INDEX));
							}
						}
					}
				}
			}

			List<Command> subsetCommands = new ArrayList<Command>();

			if (subsetFeatures != null) {

				for (int i = 0; i < subsetFeatures.length; i++) {

					if (subsetFeatures[i].isMany()) {
						Collection<?> values = (Collection<?>) owner
							.eGet(subsetFeatures[i]);

						for (Object element : values) {

							if (collection.contains(element)) {
								subsetCommands.add(AddCommand.create(domain,
									owner, subsetFeatures[i],
									Collections.singleton(element),
									CommandParameter.NO_INDEX));
							}
						}

						appendAndExecute(RemoveCommand.create(domain, owner,
							subsetFeatures[i], values));
					} else {
						Object object = owner.eGet(subsetFeatures[i]);

						if (object != null) {
							EStructuralFeature.Internal subsetFeature = (EStructuralFeature.Internal) subsetFeatures[i];

							if (collection.contains(object)) {
								subsetCommands.add(subsetFeature.isContainer()
									&& !subsetFeature.getEOpposite().isMany()
									? new SetCommand(domain, owner,
										subsetFeatures[i], object)
									: SetCommand.create(domain, owner,
										subsetFeatures[i], object));
							}

							appendAndExecute(subsetFeature.isContainer()
								&& !subsetFeature.getEOpposite().isMany()
								? new SetCommand(domain, owner,
									subsetFeatures[i], null)
								: SetCommand.create(domain, owner,
									subsetFeatures[i], null));
						}
					}
				}
			}

			super.execute();

			resultIndex = getCommandList().size() - 1;

			for (Command subsetAddCommand : subsetCommands) {
				appendAndExecute(subsetAddCommand);
			}
		} else {

			if (supersetFeatures != null) {

				if (value != null) {

					for (int i = 0; i < supersetFeatures.length; i++) {

						if (supersetFeatures[i].isMany()) {
							Collection<?> values = (Collection<?>) owner
								.eGet(supersetFeatures[i]);

							if (!values.contains(value)) {
								appendAndExecute(AddCommand.create(domain,
									owner, supersetFeatures[i],
									Collections.singleton(value),
									CommandParameter.NO_INDEX));
							}
						} else {

							if (!value.equals(owner.eGet(supersetFeatures[i]))) {
								appendAndExecute(SetCommand.create(domain,
									owner, supersetFeatures[i], value));
							}
						}
					}
				}
			}

			if (subsetFeatures != null) {

				for (int i = 0; i < subsetFeatures.length; i++) {
					Object object = owner.eGet(subsetFeatures[i]);

					if (object != null && !object.equals(value)) {
						EStructuralFeature.Internal subsetFeature = (EStructuralFeature.Internal) subsetFeatures[i];

						appendAndExecute(subsetFeature.isContainer()
							&& !subsetFeature.getEOpposite().isMany()
							? new SetCommand(domain, owner, subsetFeatures[i],
								null)
							: SetCommand.create(domain, owner,
								subsetFeatures[i], null));
					}
				}
			}

			super.execute();
		}
	}

}