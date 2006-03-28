/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConvertModelAction.java,v 1.1 2006/03/28 21:07:32 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.editor.actions.UMLCommandAction;

public abstract class ConvertModelAction
		extends UMLCommandAction {

	protected Profile applyProfile(org.eclipse.uml2.uml.Package package_,
			String uri) {
		Profile profile = (Profile) UML2Util.load(package_.eResource()
			.getResourceSet(), URI.createURI(uri), UMLPackage.Literals.PROFILE);

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
