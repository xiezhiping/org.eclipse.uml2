/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: UML2Handler.java,v 1.5 2004/06/15 16:13:32 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMIHandler;

/**
 * The SAX handler for UML2 resources.
 */
public class UML2Handler
	extends SAXXMIHandler {

	/**
	 * Constructs a new UML2 handler for the specified resource with the
	 * specified helper and options.
	 * 
	 * @param xmiResource
	 *            The resource for the new handler.
	 * @param helper
	 *            The helper for the new handler.
	 * @param options
	 *            The load options for the new handler.
	 */
	public UML2Handler(XMLResource xmiResource, XMLHelper helper, Map options) {
		super(xmiResource, helper, options);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHandler#getURIConverter()
	 */
	protected URIConverter getURIConverter() {
		return new UML2URIConverterImpl(resourceSet.getURIConverter());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHandler#endDocument()
	 */
	public void endDocument() {
		super.endDocument();

		if (null != extendedMetaData) {

			for (Iterator demandedPackages = extendedMetaData
				.demandedPackages().iterator(); demandedPackages.hasNext();) {

				EPackage ePackage = (EPackage) demandedPackages.next();
				String nsURI = ePackage.getNsURI();

				if (null != nsURI) {

					if (null != urisToLocations) {
						URI locationURI = (URI) urisToLocations.get(nsURI);

						if (null != locationURI) {
							Resource resource = new ResourceImpl();
							resource.setURI(locationURI);
							resource.getContents().add(ePackage);
						}
					}

					for (Iterator entries = helper.getPrefixToNamespaceMap()
						.iterator(); entries.hasNext();) {

						Map.Entry entry = (Map.Entry) entries.next();

						if (nsURI.equals(entry.getValue())) {
							ePackage.setNsPrefix((String) entry.getKey());
						}
					}
				}
			}
		}
	}
}