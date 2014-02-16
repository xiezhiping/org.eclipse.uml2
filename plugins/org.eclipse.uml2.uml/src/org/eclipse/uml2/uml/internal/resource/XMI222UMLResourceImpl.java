/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.uml2.uml.resource.XMI222UMLResource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;

/**
 * Resource that converts .xmi models.
 * OMG:  UML 2.2 and UML 2.4
 * API:  UML2 3.x and UML2 4.0.x
 * 
 * @since 4.0
 */
public class XMI222UMLResourceImpl
		extends UMLResourceImpl
		implements XMI222UMLResource {

	public XMI222UMLResourceImpl(URI uri) {
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
		return new XMI222UMLLoadImpl(createXMLHelper());
	}

	@Override
	protected XMLSave createXMLSave() {
		return new XMI2UMLSaveImpl(createXMLHelper());
	}
}
