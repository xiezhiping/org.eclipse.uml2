/*
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: XMI212UMLResourceImpl.java,v 1.2 2008/11/04 14:29:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.uml2.uml.resource.XMI212UMLResource;

/**
 * Resource that converts .xmi models.
 * OMG:  UML 2.1.x and UML 2.2 
 * API:  UML2 2.2.x and UML2 3.0.x 
 * 
 * @since 3.0
 */
public class XMI212UMLResourceImpl
		extends UMLResourceImpl
		implements XMI212UMLResource {

	public XMI212UMLResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new XMI2UMLHelperImpl(this);
	}

	@Override
	protected boolean assignIDsWhileLoading() {
		return false;
	}

	@Override
	protected XMLLoad createXMLLoad() {
		return new XMI212UMLLoadImpl(createXMLHelper());
	}

	@Override
	protected XMLSave createXMLSave() {
		return new XMI2UMLSaveImpl(createXMLHelper());
	}
}
