/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: XMI2UMLHelperImpl.java,v 1.2 2006/12/14 15:49:34 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

public class XMI2UMLHelperImpl
		extends XMIHelperImpl {

	public XMI2UMLHelperImpl(XMLResource resource) {
		super(resource);
	}

	@Override
	public String getHREF(EObject obj) {
		String href = super.getHREF(obj);

		if (href.startsWith(UMLResource.UML_METAMODEL_URI)) {
			href = XMI2UMLResource.UML_METAMODEL_URI + href.substring(href.indexOf('#'));
		} else if (href.startsWith(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI)) {
			href = XMI2UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + href.substring(href.indexOf('#'));
		} else if (href.startsWith(UMLResource.STANDARD_PROFILE_URI)) {
			href = XMI2UMLResource.STANDARD_PROFILE_URI + href.substring(href.indexOf('#'));
		}

		return href;
	}

}
