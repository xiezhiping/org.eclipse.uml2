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
 * $Id: UML22UMLResourceImpl.java,v 1.3 2006/12/14 15:49:34 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.uml2.uml.resource.UML22UMLResource;

public class UML22UMLResourceImpl
		extends UMLResourceImpl
		implements UML22UMLResource {

	public UML22UMLResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected XMLLoad createXMLLoad() {
		return new UML22UMLLoadImpl(createXMLHelper());
	}

}
