/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2LoadImpl.java,v 1.4 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.SAXWrapper;
import org.eclipse.emf.ecore.xmi.impl.XMILoadImpl;
import org.xml.sax.helpers.DefaultHandler;

/**
 *  
 */
public class UML2LoadImpl
	extends XMILoadImpl {

	public UML2LoadImpl(XMLHelper helper) {
		super(helper);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl#makeDefaultHandler()
	 */
	protected DefaultHandler makeDefaultHandler() {
		return new SAXWrapper(new UML2Handler(resource, helper, options));
	}

}