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
 * $Id: UMLLoadImpl.java,v 1.3 2006/12/14 15:49:34 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMILoadImpl;
import org.xml.sax.helpers.DefaultHandler;


public class UMLLoadImpl
		extends XMILoadImpl {

	public UMLLoadImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected DefaultHandler makeDefaultHandler() {
		return new UMLHandler(resource, helper, options);
	}

}
