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
 * $Id: UML2Handler.java,v 1.3 2004/06/10 13:06:34 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMIHandler;

/**
 *  
 */
public class UML2Handler
	extends SAXXMIHandler {

	public UML2Handler(XMLResource xmiResource, XMLHelper helper, Map options) {
		super(xmiResource, helper, options);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHandler#getPackageForURI(java.lang.String)
	 */
	protected EPackage getPackageForURI(String uriString) {

		if (null == uriString) {
			return null;
		}

		EPackage ePackage = null == extendedMetaData
			? packageRegistry.getEPackage(uriString)
			: extendedMetaData.getPackage(uriString);

		if (null == ePackage) {
			URI uri = URI.createURI(uriString);

			if (null == uri.scheme()) {

				for (Iterator entries = packageRegistry.entrySet().iterator(); entries
					.hasNext();) {

					Map.Entry entry = (Map.Entry) entries.next();
					String nsURI = (String) entry.getKey();

					if (null != nsURI
						&& nsURI.endsWith(uriString)
						&& nsURI
							.charAt(nsURI.length() - uriString.length() - 1) == '/') {

						oldStyleProxyURIs = true;
						return (EPackage) entry.getValue();
					}
				}
			}

			if (null != urisToLocations) {
				URI locationURI = (URI) urisToLocations.get(uriString);

				if (null != locationURI) {
					uri = locationURI;
				}
			}

			Resource resource = null;

			if (null != resourceSet) {
				URI trimmedURI = uri.trimFragment();
				resource = resourceSet.getResource(trimmedURI, false);

				if (null == resource) {

					try {
						InputStream inputStream = new UML2URIConverterImpl(
							resourceSet.getURIConverter())
							.createInputStream(trimmedURI);
						resource = resourceSet.createResource(trimmedURI);

						if (null == resource) {
							inputStream.close();
						} else {
							resource.load(inputStream, resourceSet
								.getLoadOptions());
						}
					} catch (IOException ioe) {
						// ignore
					}
				}
			}

			if (null != resource) {
				Object content = null;

				if (null != uri.fragment()) {
					content = resource.getEObject(uri.fragment());
				} else {
					List contents = resource.getContents();

					if (!contents.isEmpty()) {
						content = contents.get(0);
					}
				}

				if (content instanceof EPackage) {
					ePackage = (EPackage) content;

					if (null != extendedMetaData) {
						extendedMetaData.putPackage(extendedMetaData
							.getNamespace(ePackage), ePackage);
					} else {
						resourceSet.getPackageRegistry().put(
							ePackage.getNsURI(), ePackage);
					}
				}
			}
		}

		if (null == ePackage) {
			error(new PackageNotFoundException(uriString, getLocation(),
				getLineNumber(), getColumnNumber()));
		}

		return ePackage;
	}

}