/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConvertModelAction.java,v 1.4 2007/01/04 18:47:13 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.editor.actions.UMLCommandAction;

public abstract class ConvertModelAction
		extends UMLCommandAction {

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof Model) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	protected Profile applyProfile(org.eclipse.uml2.uml.Package package_,
			String uri) {
		Profile profile = UML2Util.load(package_.eResource().getResourceSet(),
			URI.createURI(uri), UMLPackage.Literals.PROFILE);

		if (profile != null && !package_.isProfileApplied(profile)) {
			package_.applyProfile(profile);
		}

		return profile;
	}

	protected boolean applyStereotype(Element element, Stereotype stereotype) {

		if (stereotype != null && !element.isStereotypeApplied(stereotype)) {
			element.applyStereotype(stereotype);

			return true;
		}

		return false;
	}

	protected String setID(EObject eObject) {
		Resource eResource = eObject.eResource();

		if (eResource instanceof XMIResource) {
			XMIResource xmiResource = (XMIResource) eResource;
			String id = xmiResource.getID(eObject);
			xmiResource.setID(eObject, UML2Util
				.getXMIIdentifier((InternalEObject) eObject));
			return id;
		}

		return null;
	}

}
