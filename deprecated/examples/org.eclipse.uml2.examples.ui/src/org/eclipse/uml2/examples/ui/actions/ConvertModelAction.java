/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ConvertModelAction.java,v 1.1 2005/04/14 17:32:07 khussey Exp $
 */
package org.eclipse.uml2.examples.ui.actions;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.Profile;
import org.eclipse.uml2.Stereotype;
import org.eclipse.uml2.util.UML2Util;

/**
 * 
 */
public abstract class ConvertModelAction
		extends UML2CommandAction {

	protected Profile applyProfile(org.eclipse.uml2.Package package_, String uri) {
		Profile profile = (Profile) UML2Util.load(package_.eResource()
			.getResourceSet(), URI.createURI(uri));

		if (null != profile && !package_.isApplied(profile)) {
			package_.apply(profile);
		}

		return profile;
	}

	protected boolean applyStereotype(Element element, Stereotype stereotype) {

		if (null != stereotype && !element.isApplied(stereotype)) {
			element.apply(stereotype);

			return true;
		}

		return false;
	}

}
